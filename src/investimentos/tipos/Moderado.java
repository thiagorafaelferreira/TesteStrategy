package investimentos.tipos;

import investimentos.Conta;
import investimentos.interfaces.Investimento;

public class Moderado implements Investimento {

	@Override
	public Double calcula(Conta conta) {
		if(new java.util.Random().nextDouble() > 0.50) {
			return conta.getSaldo() * 0.07;
		}
		return conta.getSaldo() * 0.025;
	}

}
