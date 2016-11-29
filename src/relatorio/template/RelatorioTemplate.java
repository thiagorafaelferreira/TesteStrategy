package relatorio.template;

import java.util.List;

import investimentos.Conta;

public abstract class RelatorioTemplate {

	protected abstract void getCabecalho();
	protected abstract void getRodape();
	protected abstract void getCorpo(List<Conta> contas);
	
	public void imprime(List<Conta> contas) {
		getCabecalho();
		getCorpo(contas);
		getRodape();
	}
	
}
