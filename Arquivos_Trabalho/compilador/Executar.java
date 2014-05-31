/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import compilador.lexer.*;
import compilador.node.*;
import compilador.node.EOF;
import java.io.IOException;
import java.io.PushbackReader;

/**
 *
 * @author Affonso
 */
public class Executar extends Lexer {

    private int contador;
    private TComentario comentario;
    private StringBuffer strBuffer;

    public Executar(PushbackReader in) {
        super(in);
    }

    public void filtrar() throws LexerException, LexerException, IOException {
        String teste = "";
        int linha = 0;
        while (!(peek() instanceof EOF)) {
            if (state.equals(State.COMENTARIO)) {
                if (comentario == null) {
                    comentario = (TComentario) token;
                    contador = 1;
                    token = null;
                } else {
                    if (token instanceof TComentario) {
                        contador++;
                    } else if (token instanceof TComentarioFim) {
                        contador--;
                    }
                    if (contador != 0) {
                        token = null;
                    } else {
                        token = comentario;
                        state = State.NORMAL;
                        comentario = null;
                    }
                }
            } else {
                if (peek().getLine() > linha) {
                    linha = peek().getLine();
                    teste = teste + "\n";
                }
                teste = teste + " " + next().getClass().getSimpleName();                
            }            
        }
        System.out.println(teste);
    }
}