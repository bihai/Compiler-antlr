# clean the generated file and recompile
# May 31,2014  whimsycwd 


#source config.profile

rm Tiger*.java 2>/dev/null
#rm Tiger*.class 2>/dev/null
rm Tiger*.tokens 2>/dev/null
rm ./classes/* 2>/dev/null

echo "File deleted"

echo "ANTLR Generating"
java  org.antlr.v4.Tool Tiger.g4

echo "Compile Start"

#javac  Tiger*.java -d ./classes/
javac *.java -d ./classes/

