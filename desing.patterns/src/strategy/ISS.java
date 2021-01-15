package strategy;
import java.math.BigDecimal;

import desingpattern.Orcamento;

public class ISS {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
