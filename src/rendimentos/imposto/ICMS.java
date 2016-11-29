package rendimentos.imposto;

import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public class ICMS implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
	}

}
