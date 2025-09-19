all:
	javac -d out `find avaj -name "*.java"`

run: all
	java -cp out avaj.Main scenario.txt

clean:
	rm -rf out
