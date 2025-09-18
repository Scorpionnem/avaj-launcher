import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
import java.io.IOException;

public class Main {
	private static int 			simCount = -1;
	private final static WeatherTower	tower = new WeatherTower();
	private final static AircraftFactory airport = AircraftFactory.getInstance();

	private static void parseLine(int lineNbr, String line) throws IncorrectLineException, NumberFormatException, IOException {
		if (line.isEmpty())
			return ;

		String[] args = line.split(" ");

		if (args.length < 1)
			return ;

		if (lineNbr == 0) {
			simCount = Integer.valueOf(args[0]);
			return ;
		}

		if (args[0].equals("Baloon") && args.length == 5 && lineNbr != 0) {
			tower.register(airport.newAircraft("Baloon", args[1], new Coordinates(Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]))));
		}
		else if (args[0].equals("Helicopter") && args.length == 5 && lineNbr != 0) {
			tower.register(airport.newAircraft("Helicopter", args[1], new Coordinates(Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]))));
		}
		else if (args[0].equals("JetPlane") && args.length == 5 && lineNbr != 0) {
			tower.register(airport.newAircraft("JetPlane", args[1], new Coordinates(Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4]))));
		}
		else
			throw new IncorrectLineException("Invalid line in file at line: " + lineNbr);
	}

	private static void parseFile(String file) throws FileNotFoundException, IncorrectLineException, NumberFormatException, InvalidSimCount, IOException {
		File	inputFile = new File(file);
		int		line = 0;

		Scanner	fileReader = new Scanner(inputFile);
		while (fileReader.hasNextLine()) {
			String data = fileReader.nextLine();
			parseLine(line++, data);
		}
		if (simCount < 0)
			throw new InvalidSimCount("Invalid simulation count: " + simCount);
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Error: Invalid argument count!");
			return ;
		}

		try {
			parseFile(args[0]);
		} catch (IncorrectLineException | NumberFormatException | InvalidSimCount | FileNotFoundException e) {
			System.out.println("Error: " + e);
			return ;
		} catch (IOException e) {
			System.out.println("Error: " + e);
			return ;
		}

		try {
			for (int i = 0; i < simCount; i++) {
				tower.changeWeather();
	
				tower.checkLandings();
			}
	
			tower.unregisterAll();
			Logger.getInstance().close();
		} catch (IOException e) {
			System.out.println("Error: " + e);
			return ;
		}
	}
}
