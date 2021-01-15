package chainOfResponsibilityAndTemplate;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveCalcular(Orcamento orcamento) {
		return true;
	}

}
