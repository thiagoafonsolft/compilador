/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TNegacao extends Token
{
    public TNegacao()
    {
        super.setText("nao");
    }

    public TNegacao(int line, int pos)
    {
        super.setText("nao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNegacao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNegacao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNegacao text.");
    }
}
