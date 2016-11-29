package rendimentos.imposto;
import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public class ICCC implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		if(orcamento.getValorTotal() < 1000) {
			return orcamento.getValorTotal() * 0.05;
		} 
		if(orcamento.getValorTotal() <= 3000) {
			return orcamento.getValorTotal() * 0.07 ;
		}
		return orcamento.getValorTotal() * 0.08 + 30.0;
	}

}
