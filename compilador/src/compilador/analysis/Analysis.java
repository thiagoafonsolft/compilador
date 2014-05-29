/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.analysis;

import compilador.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseTBranco(TBranco node);
    void caseTPrograma(TPrograma node);
    void caseTInicio(TInicio node);
    void caseTFim(TFim node);
    void caseTPonto(TPonto node);
    void caseTDoispontos(TDoispontos node);
    void caseTVirgula(TVirgula node);
    void caseTPontovirgula(TPontovirgula node);
    void caseTAbrecolchete(TAbrecolchete node);
    void caseTFechacolchete(TFechacolchete node);
    void caseTInteiro(TInteiro node);
    void caseTReal(TReal node);
    void caseTCaractere(TCaractere node);
    void caseTId(TId node);
    void caseTNInteiro(TNInteiro node);
    void caseTNReal(TNReal node);
    void caseTTexto(TTexto node);
    void caseTAdicao(TAdicao node);
    void caseTSubtracao(TSubtracao node);
    void caseTMultiplicacao(TMultiplicacao node);
    void caseTDivisao(TDivisao node);
    void caseTLeia(TLeia node);
    void caseTEscreva(TEscreva node);
    void caseTSe(TSe node);
    void caseTEntao(TEntao node);
    void caseTSenao(TSenao node);
    void caseTFimse(TFimse node);
    void caseTEnquanto(TEnquanto node);
    void caseTFimenquanto(TFimenquanto node);
    void caseTFaca(TFaca node);
    void caseTRepita(TRepita node);
    void caseTDe(TDe node);
    void caseTAte(TAte node);
    void caseTAvalie(TAvalie node);
    void caseTFimavalie(TFimavalie node);
    void caseTCaso(TCaso node);
    void caseTPara(TPara node);
    void caseTFimpara(TFimpara node);
    void caseTPasso(TPasso node);
    void caseTE(TE node);
    void caseTOu(TOu node);
    void caseTXor(TXor node);
    void caseTIgual(TIgual node);
    void caseTDiferente(TDiferente node);
    void caseTMenor(TMenor node);
    void caseTMaior(TMaior node);
    void caseTMenorigual(TMenorigual node);
    void caseTMaiorigual(TMaiorigual node);
    void caseTNegacao(TNegacao node);
    void caseTParenteseesquerda(TParenteseesquerda node);
    void caseTParentesedireita(TParentesedireita node);
    void caseTAtribuicao(TAtribuicao node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
