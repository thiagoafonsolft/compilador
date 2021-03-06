/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AAtribuirComando extends PComando
{
    private PVar _var_;
    private PExpressao _expressao_;

    public AAtribuirComando()
    {
        // Constructor
    }

    public AAtribuirComando(
        @SuppressWarnings("hiding") PVar _var_,
        @SuppressWarnings("hiding") PExpressao _expressao_)
    {
        // Constructor
        setVar(_var_);

        setExpressao(_expressao_);

    }

    @Override
    public Object clone()
    {
        return new AAtribuirComando(
            cloneNode(this._var_),
            cloneNode(this._expressao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtribuirComando(this);
    }

    public PVar getVar()
    {
        return this._var_;
    }

    public void setVar(PVar node)
    {
        if(this._var_ != null)
        {
            this._var_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._var_ = node;
    }

    public PExpressao getExpressao()
    {
        return this._expressao_;
    }

    public void setExpressao(PExpressao node)
    {
        if(this._expressao_ != null)
        {
            this._expressao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._var_)
            + toString(this._expressao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._var_ == child)
        {
            this._var_ = null;
            return;
        }

        if(this._expressao_ == child)
        {
            this._expressao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._var_ == oldChild)
        {
            setVar((PVar) newChild);
            return;
        }

        if(this._expressao_ == oldChild)
        {
            setExpressao((PExpressao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
