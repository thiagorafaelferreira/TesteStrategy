package rendimentos.imposto;

import rendimentos.Item;
import rendimentos.Orcamento;
import rendimentos.template.TemplateImposto;

public class IKCVTemplate extends TemplateImposto {

	@Override
	protected boolean condicao(Orcamento orcamento) {
		return orcamento.getValorTotal() > 500d && algumItemValorMaiorQueCemNo(orcamento);
	}

	private boolean algumItemValorMaiorQueCemNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100d) return true; 
		}
		return false;
	}

	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.10;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

}
