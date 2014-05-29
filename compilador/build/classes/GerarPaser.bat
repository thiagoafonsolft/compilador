cls
@ECHO OFF
cd compilador
rd /S /Q analysis
rd /S /Q lexer
rd /S /Q node
rd /S /Q parser
cd ..
java -jar lib\sablecc.jar lexer.grammar
pause
exit