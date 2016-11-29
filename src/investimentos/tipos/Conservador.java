package investimentos.tipos;

import investimentos.Conta;
import investimentos.interfaces.Investimento;

public class Conservador implements Investimento {

	@Override
	public Double calcula(Conta conta) {
		return conta.getSaldo() * 0.08;
	}
	
}
