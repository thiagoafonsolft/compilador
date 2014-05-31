cls
@ECHO OFF
cd compilador
rd /S /Q analysis
rd /S /Q lexer
rd /S /Q node
rd /S /Q parser
cd ..
pause
java -jar lib\sablecc.jar portugolV2.grammar
pause
exit