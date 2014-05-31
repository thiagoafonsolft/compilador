package compilador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import compilador.lexer.*;
import compilador.node.*;

public class Compilador {


    public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        String filePath = new File("").getAbsolutePath();
        File file = new File(filePath+"/src/compilador/teste/teste.txt");
        PushbackReader pushbackReader = new PushbackReader(new FileReader(file));
        Lexer lex = new Lexer(pushbackReader);
        String teste = "";
        int linha = 0;
        while (!(lex.peek() instanceof EOF))
        {            
            if (lex.peek().getLine() > linha)
            {
                linha = lex.peek().getLine();
                teste = teste + "\n";
            }
            teste =  teste + " " + lex.next().getClass().getSimpleName();
        }
        System.out.println(teste);       
    }

}
