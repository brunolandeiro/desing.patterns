package chainOfResponsibilityAndTemplate;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
	
	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
