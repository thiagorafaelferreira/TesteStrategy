package rendimentos.imposto;
import rendimentos.Orcamento;
import rendimentos.interfaces.Imposto;

public class ISS implements Imposto {

	@Override
	public Double calcula(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

}
