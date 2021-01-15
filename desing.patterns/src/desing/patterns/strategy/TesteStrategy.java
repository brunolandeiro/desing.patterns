package desing.patterns.strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.60);
		
		ICMSS icmss = new ICMSS();
		ISS iss = new ISS();

		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();

		calculadorDeImposto.calcula(orcamento, icmss);
		calculadorDeImposto.calcula(orcamento, iss);

	}

}
