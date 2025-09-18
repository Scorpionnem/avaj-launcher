all:
	find * -name "*.java" > sources.txt
	javac @sources.txt

run: all
	java Main scenario.txt

clean:
	rm -rf *.class
