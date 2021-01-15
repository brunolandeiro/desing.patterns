package chainOfResponsibilityAndTemplate;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {
	
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getQuantidadeItens() > 5;
	}

}
