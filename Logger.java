import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Logger {
	private BufferedWriter writer;
	private static Logger	instance;

	private Logger() throws IOException {
		writer = new BufferedWriter(new FileWriter("simulation.txt"));
	}
	public static Logger getInstance() throws IOException {
		if (instance == null)
			instance = new Logger();
		return (instance);
	}
	public void	write(String str) throws IOException {
		writer.write(str + "\n");
	}
	public void close() throws IOException {
		writer.close();
	}
}
