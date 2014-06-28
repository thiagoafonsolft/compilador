/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AExpLogicaOriginal extends PExpLogicaOriginal
{
    private PSomaRelacional _somaRelacional_;
    private PSomaExp _somaExp_;

    public AExpLogicaOriginal()
    {
        // Constructor
    }

    public AExpLogicaOriginal(
        @SuppressWarnings("hiding") PSomaRelacional _somaRelacional_,
        @SuppressWarnings("hiding") PSomaExp _somaExp_)
    {
        // Constructor
        setSomaRelacional(_somaRelacional_);

        setSomaExp(_somaExp_);

    }

    @Override
    public Object clone()
    {
        return new AExpLogicaOriginal(
            cloneNode(this._somaRelacional_),
            cloneNode(this._somaExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpLogicaOriginal(this);
    }

    public PSomaRelacional getSomaRelacional()
    {
        return this._somaRelacional_;
    }

    public void setSomaRelacional(PSomaRelacional node)
    {
        if(this._somaRelacional_ != null)
        {
            this._somaRelacional_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._somaRelacional_ = node;
    }

    public PSomaExp getSomaExp()
    {
        return this._somaExp_;
    }

    public void setSomaExp(PSomaExp node)
    {
        if(this._somaExp_ != null)
        {
            this._somaExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._somaExp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._somaRelacional_)
            + toString(this._somaExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._somaRelacional_ == child)
        {
            this._somaRelacional_ = null;
            return;
        }

        if(this._somaExp_ == child)
        {
            this._somaExp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._somaRelacional_ == oldChild)
        {
            setSomaRelacional((PSomaRelacional) newChild);
            return;
        }

        if(this._somaExp_ == oldChild)
        {
            setSomaExp((PSomaExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}