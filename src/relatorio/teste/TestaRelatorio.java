package relatorio.teste;

import java.util.ArrayList;
import java.util.List;

import investimentos.Conta;
import relatorio.RelatorioComplexo;
import relatorio.RelatorioSimples;

public class TestaRelatorio {

	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(300d, "Thiago"));
		contas.add(new Conta(400d, "Carlos"));
		
		new RelatorioSimples().imprime(contas);
		new RelatorioComplexo().imprime(contas);
	}
	
}
