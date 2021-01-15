package desing.patterns.strategy;

public class CalculadorDeImposto {
	
	public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto) {
		double resultado = estrategiaDeImposto.calcula(orcamento);
		System.out.println(resultado);
	}

}
