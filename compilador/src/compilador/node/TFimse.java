/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TFimse extends Token
{
    public TFimse()
    {
        super.setText("fimse");
    }

    public TFimse(int line, int pos)
    {
        super.setText("fimse");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimse(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimse(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimse text.");
    }
}