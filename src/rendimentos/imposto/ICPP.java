package rendimentos.imposto;

import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public class ICPP implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.getValorTotal() >= 500d) {
			return orcamento.getValorTotal() * 0.07;
		}
		return orcamento.getValorTotal() * 0.05;
	}

}
