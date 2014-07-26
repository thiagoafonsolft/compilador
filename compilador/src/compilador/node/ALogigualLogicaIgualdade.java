/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ALogigualLogicaIgualdade extends PLogicaIgualdade
{
    private PLogicaIgualdade _logicaIgualdade_;
    private PIgualdade _igualdade_;
    private PLogicaMaior _logicaMaior_;

    public ALogigualLogicaIgualdade()
    {
        // Constructor
    }

    public ALogigualLogicaIgualdade(
        @SuppressWarnings("hiding") PLogicaIgualdade _logicaIgualdade_,
        @SuppressWarnings("hiding") PIgualdade _igualdade_,
        @SuppressWarnings("hiding") PLogicaMaior _logicaMaior_)
    {
        // Constructor
        setLogicaIgualdade(_logicaIgualdade_);

        setIgualdade(_igualdade_);

        setLogicaMaior(_logicaMaior_);

    }

    @Override
    public Object clone()
    {
        return new ALogigualLogicaIgualdade(
            cloneNode(this._logicaIgualdade_),
            cloneNode(this._igualdade_),
            cloneNode(this._logicaMaior_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogigualLogicaIgualdade(this);
    }

    public PLogicaIgualdade getLogicaIgualdade()
    {
        return this._logicaIgualdade_;
    }

    public void setLogicaIgualdade(PLogicaIgualdade node)
    {
        if(this._logicaIgualdade_ != null)
        {
            this._logicaIgualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicaIgualdade_ = node;
    }

    public PIgualdade getIgualdade()
    {
        return this._igualdade_;
    }

    public void setIgualdade(PIgualdade node)
    {
        if(this._igualdade_ != null)
        {
            this._igualdade_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igualdade_ = node;
    }

    public PLogicaMaior getLogicaMaior()
    {
        return this._logicaMaior_;
    }

    public void setLogicaMaior(PLogicaMaior node)
    {
        if(this._logicaMaior_ != null)
        {
            this._logicaMaior_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicaMaior_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._logicaIgualdade_)
            + toString(this._igualdade_)
            + toString(this._logicaMaior_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._logicaIgualdade_ == child)
        {
            this._logicaIgualdade_ = null;
            return;
        }

        if(this._igualdade_ == child)
        {
            this._igualdade_ = null;
            return;
        }

        if(this._logicaMaior_ == child)
        {
            this._logicaMaior_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._logicaIgualdade_ == oldChild)
        {
            setLogicaIgualdade((PLogicaIgualdade) newChild);
            return;
        }

        if(this._igualdade_ == oldChild)
        {
            setIgualdade((PIgualdade) newChild);
            return;
        }

        if(this._logicaMaior_ == oldChild)
        {
            setLogicaMaior((PLogicaMaior) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}