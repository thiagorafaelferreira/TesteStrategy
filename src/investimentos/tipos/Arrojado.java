package investimentos.tipos;

import investimentos.Conta;
import investimentos.interfaces.Investimento;

public class Arrojado implements Investimento {

	@Override
	public Double calcula(Conta conta) {
		if(new java.util.Random().nextDouble() < 0.20) {
			return conta.getSaldo() * 0.05;
		}
		if(new java.util.Random().nextDouble() < 0.30) {
			return conta.getSaldo() * 0.03;
		}
		return conta.getSaldo() * 0.06;
	}

}
