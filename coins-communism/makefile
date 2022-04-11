# makefile for coin factory project
#
# @author Olivia Hess
# @version 03/29/2022
#

JFLAGS = -d bin -sourcepath src
JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_COMMAND =  -jar checkstyle-5.5-all.jar

default:
	@echo "usage: make target"
	@echo "4 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ test - runs JUnit5 tests"
	@echo "____________________ check - runs my custom checkstyle"
	@echo "Just starting with make? Try these 4 make commands successively:"
	@echo "________ make clean ; make compile ; make test ; make check"

compile: $(JUNIT5_JAR)
	javac ${JFLAGS} -cp .:$(JUNIT5_JAR) src/**/*.java

test: $(JUNIT5_JAR)
	java -cp .:bin:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path

check: mystyle.xml
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml src/**/*.java

demo: ./bin/**/*.class
	java -cp bin coins.Demo

clean:
	rm -f *~
	rm -f ./bin/**/*.class
