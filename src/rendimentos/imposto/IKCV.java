package rendimentos.imposto;

import rendimentos.Item;
import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public class IKCV implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.getValorTotal() > 500d && algumItemValorMaiorQueCemNo(orcamento)) {
			return orcamento.getValorTotal() * 0.10;
		}
		return orcamento.getValorTotal() * 0.06;
	}

	private boolean algumItemValorMaiorQueCemNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100d) return true; 
		}
		return false;
	}

}
