


rm Tiger*.java 2>/dev/null
rm Tiger*.class 2>/dev/null
rm Tiger*.tokens 2>/dev/null

java org.antlr.v4.Tool Tiger.g4
javac Tiger*.java
