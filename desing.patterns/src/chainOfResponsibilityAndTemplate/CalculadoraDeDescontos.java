package chainOfResponsibilityAndTemplate;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
