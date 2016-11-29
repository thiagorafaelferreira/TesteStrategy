package rendimentos.imposto;

import rendimentos.Orcamento;
import rendimentos.template.TemplateImposto;

public class ICPPTemplate extends TemplateImposto {

	@Override
	protected boolean condicao(Orcamento orcamento) {
		return orcamento.getValorTotal() >= 500d;
	}

	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.07;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.05;
	}

}
