package relatorio;

import java.util.List;

import investimentos.Conta;
import relatorio.template.RelatorioTemplate;

public class RelatorioSimples extends RelatorioTemplate {

	@Override
	protected void getCabecalho() {
		System.out.println("Banco Internacional: (51) 3472-0000");
	}

	@Override
	protected void getRodape() {
		System.out.println("internacional@gmail.com");		
	}

	@Override
	protected void getCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular());
		}		
	}

}
