package rendimentos.imposto;

import java.util.Collections;

import rendimentos.Item;
import rendimentos.Orcamento;
import rendimentos.template.TemplateImposto;

public class IHIT extends TemplateImposto {

	@Override
	protected boolean condicao(Orcamento orcamento) {
		return temMaisDeUmItemIgual(orcamento);
	}
	
	

	private boolean temMaisDeUmItemIgual(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(Collections.frequency(orcamento.getItens(), item) >= 2) {
				System.out.println("Tem quantidade maior que 2");
				return true;
			}
		}
		System.out.println("Não tem");
		return false;
	}



	@Override
	protected Double impostoMaximo(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.13 + 100;
	}

	@Override
	protected Double impostoMinimo(Orcamento orcamento) {
		return orcamento.getValorTotal() * (0.01 * orcamento.getItens().size());
	}

}
