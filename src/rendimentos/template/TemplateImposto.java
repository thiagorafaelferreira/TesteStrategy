package rendimentos.template;

import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public abstract class TemplateImposto implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		if(condicao(orcamento)) {
			return impostoMaximo(orcamento);
		}
		return impostoMinimo(orcamento);
	}

	protected abstract boolean condicao(Orcamento orcamento);

	protected abstract Double impostoMaximo(Orcamento orcamento);

	protected abstract Double impostoMinimo(Orcamento orcamento);

}
