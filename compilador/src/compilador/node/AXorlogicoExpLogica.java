/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AXorlogicoExpLogica extends PExpLogica
{
    private PExpLogica _lfet_;
    private PExpLogica _right_;

    public AXorlogicoExpLogica()
    {
        // Constructor
    }

    public AXorlogicoExpLogica(
        @SuppressWarnings("hiding") PExpLogica _lfet_,
        @SuppressWarnings("hiding") PExpLogica _right_)
    {
        // Constructor
        setLfet(_lfet_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AXorlogicoExpLogica(
            cloneNode(this._lfet_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorlogicoExpLogica(this);
    }

    public PExpLogica getLfet()
    {
        return this._lfet_;
    }

    public void setLfet(PExpLogica node)
    {
        if(this._lfet_ != null)
        {
            this._lfet_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lfet_ = node;
    }

    public PExpLogica getRight()
    {
        return this._right_;
    }

    public void setRight(PExpLogica node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lfet_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lfet_ == child)
        {
            this._lfet_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lfet_ == oldChild)
        {
            setLfet((PExpLogica) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
