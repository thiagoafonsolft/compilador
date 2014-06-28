/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ALogicoEouxor extends PLogicoEouxor
{
    private POpLogico _opLogico_;
    private PExpLogica _expLogica_;

    public ALogicoEouxor()
    {
        // Constructor
    }

    public ALogicoEouxor(
        @SuppressWarnings("hiding") POpLogico _opLogico_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_)
    {
        // Constructor
        setOpLogico(_opLogico_);

        setExpLogica(_expLogica_);

    }

    @Override
    public Object clone()
    {
        return new ALogicoEouxor(
            cloneNode(this._opLogico_),
            cloneNode(this._expLogica_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicoEouxor(this);
    }

    public POpLogico getOpLogico()
    {
        return this._opLogico_;
    }

    public void setOpLogico(POpLogico node)
    {
        if(this._opLogico_ != null)
        {
            this._opLogico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opLogico_ = node;
    }

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opLogico_)
            + toString(this._expLogica_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opLogico_ == child)
        {
            this._opLogico_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opLogico_ == oldChild)
        {
            setOpLogico((POpLogico) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
