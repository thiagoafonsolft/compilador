/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ALogXorLogicaXor extends PLogicaXor
{
    private PLogicaXor _logicaXor_;
    private TXor _xor_;
    private PLogicaE _logicaE_;

    public ALogXorLogicaXor()
    {
        // Constructor
    }

    public ALogXorLogicaXor(
        @SuppressWarnings("hiding") PLogicaXor _logicaXor_,
        @SuppressWarnings("hiding") TXor _xor_,
        @SuppressWarnings("hiding") PLogicaE _logicaE_)
    {
        // Constructor
        setLogicaXor(_logicaXor_);

        setXor(_xor_);

        setLogicaE(_logicaE_);

    }

    @Override
    public Object clone()
    {
        return new ALogXorLogicaXor(
            cloneNode(this._logicaXor_),
            cloneNode(this._xor_),
            cloneNode(this._logicaE_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogXorLogicaXor(this);
    }

    public PLogicaXor getLogicaXor()
    {
        return this._logicaXor_;
    }

    public void setLogicaXor(PLogicaXor node)
    {
        if(this._logicaXor_ != null)
        {
            this._logicaXor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicaXor_ = node;
    }

    public TXor getXor()
    {
        return this._xor_;
    }

    public void setXor(TXor node)
    {
        if(this._xor_ != null)
        {
            this._xor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._xor_ = node;
    }

    public PLogicaE getLogicaE()
    {
        return this._logicaE_;
    }

    public void setLogicaE(PLogicaE node)
    {
        if(this._logicaE_ != null)
        {
            this._logicaE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicaE_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicaXor_)
            + toString(this._xor_)
            + toString(this._logicaE_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicaXor_ == child)
        {
            this._logicaXor_ = null;
            return;
        }

        if(this._xor_ == child)
        {
            this._xor_ = null;
            return;
        }

        if(this._logicaE_ == child)
        {
            this._logicaE_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicaXor_ == oldChild)
        {
            setLogicaXor((PLogicaXor) newChild);
            return;
        }

        if(this._xor_ == oldChild)
        {
            setXor((TXor) newChild);
            return;
        }

        if(this._logicaE_ == oldChild)
        {
            setLogicaE((PLogicaE) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
