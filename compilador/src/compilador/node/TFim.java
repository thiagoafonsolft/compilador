/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TFim extends Token
{
    public TFim()
    {
        super.setText("fim");
    }

    public TFim(int line, int pos)
    {
        super.setText("fim");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFim(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFim(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFim text.");
    }
}
