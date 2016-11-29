package relatorio;

import java.util.List;

import investimentos.Conta;
import relatorio.template.RelatorioTemplate;

public class RelatorioComplexo extends RelatorioTemplate {

	@Override
	protected void getCabecalho() {
		System.out.println("Banco Nacional: Rua Chile 990 - (51) 3472-0000");
	}

	@Override
	protected void getRodape() {
		System.out.println("nacional@gmail.com");
		
	}

	@Override
	protected void getCorpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
		}
	}

}
