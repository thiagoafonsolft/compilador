/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ADecListaDeclaracaoLista extends PDeclaracaoLista
{
    private PDeclaracaoLista _declaracaoLista_;
    private PDeclaracao _declaracao_;

    public ADecListaDeclaracaoLista()
    {
        // Constructor
    }

    public ADecListaDeclaracaoLista(
        @SuppressWarnings("hiding") PDeclaracaoLista _declaracaoLista_,
        @SuppressWarnings("hiding") PDeclaracao _declaracao_)
    {
        // Constructor
        setDeclaracaoLista(_declaracaoLista_);

        setDeclaracao(_declaracao_);

    }

    @Override
    public Object clone()
    {
        return new ADecListaDeclaracaoLista(
            cloneNode(this._declaracaoLista_),
            cloneNode(this._declaracao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecListaDeclaracaoLista(this);
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

    public PDeclaracao getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(PDeclaracao node)
    {
        if(this._declaracao_ != null)
        {
            this._declaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaracaoLista_)
            + toString(this._declaracao_);
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

        if(this._declaracao_ == child)
        {
            this._declaracao_ = null;
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

        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
