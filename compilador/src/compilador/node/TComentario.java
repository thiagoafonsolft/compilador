/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TComentario extends Token
{
    public TComentario()
    {
        super.setText("/*");
    }

    public TComentario(int line, int pos)
    {
        super.setText("/*");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComentario(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComentario(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComentario text.");
    }
}