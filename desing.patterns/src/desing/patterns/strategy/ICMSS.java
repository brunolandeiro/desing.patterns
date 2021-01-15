package desing.patterns.strategy;

public class ICMSS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.05 + 50;
	}

}
