package strategy;

import java.math.BigDecimal;

import desingpattern.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
