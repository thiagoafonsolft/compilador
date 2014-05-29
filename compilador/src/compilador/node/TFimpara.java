/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class TFimpara extends Token
{
    public TFimpara()
    {
        super.setText("fimpara");
    }

    public TFimpara(int line, int pos)
    {
        super.setText("fimpara");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimpara(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimpara(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimpara text.");
    }
}
