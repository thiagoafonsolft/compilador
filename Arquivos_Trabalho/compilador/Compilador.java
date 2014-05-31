package compilador;

import compilador.lexer.*;
import compilador.lexer.Lexer.State;
import compilador.node.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class Compilador {


    public static void main(String[] args) throws FileNotFoundException, LexerException, IOException {
        String filePath = new File("").getAbsolutePath();
        File file = new File(filePath+"/src/compilador/teste/teste.txt");
        PushbackReader pushbackReader = new PushbackReader(new FileReader(file));
        Executar exe = new Executar(pushbackReader);
        exe.filtrar();            
    }

}
