/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AListaDeclaracaoOp extends PDeclaracaoOp
{
    private PDeclaracaoLista _declaracaoLista_;

    public AListaDeclaracaoOp()
    {
        // Constructor
    }

    public AListaDeclaracaoOp(
        @SuppressWarnings("hiding") PDeclaracaoLista _declaracaoLista_)
    {
        // Constructor
        setDeclaracaoLista(_declaracaoLista_);

    }

    @Override
    public Object clone()
    {
        return new AListaDeclaracaoOp(
            cloneNode(this._declaracaoLista_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaDeclaracaoOp(this);
    }

    public PDeclaracaoLista getDeclaracaoLista()
    {
        return this._declaracaoLista_;
    }

    public void setDeclaracaoLista(PDeclaracaoLista node)
    {
        if(this._declaracaoLista_ != null)
        {
            this._declaracaoLista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracaoLista_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracaoLista_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaracaoLista_ == child)
        {
            this._declaracaoLista_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._declaracaoLista_ == oldChild)
        {
            setDeclaracaoLista((PDeclaracaoLista) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
