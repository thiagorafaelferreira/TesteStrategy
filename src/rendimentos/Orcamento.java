package rendimentos;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private Double valorTotal;
	private List<Item> itens;

	public Orcamento() {
		super();
		this.itens = new ArrayList<Item>();
		this.valorTotal = 0d;
	}

	public Double getValorTotal() {
		return valorTotal;
	}
	
 	public void adicionaItem(Item item) {
 		this.itens.add(item);
 		this.valorTotal += item.getValor();
 	}

	public List<Item> getItens() {
		return itens;
	}
	
}
