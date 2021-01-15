package chainOfResponsibilityAndTemplate;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(deveCalcular(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}
	protected abstract boolean deveCalcular(Orcamento orcamento);

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

}
