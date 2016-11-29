package investimentos;

import investimentos.interfaces.Investimento;

public class RealizadorDeInvestimentos {

	public void investe(Conta conta, Investimento investimento) {
		Double rendimento = investimento.calcula(conta);
		conta.adicionaSaldo(this.rendimentoLiquido(rendimento));
	}
	
	private Double rendimentoLiquido(Double rendimento) {
		return rendimento * 0.75;
	}
}
