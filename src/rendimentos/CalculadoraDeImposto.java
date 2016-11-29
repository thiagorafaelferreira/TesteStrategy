package rendimentos;

import rendimentos.interfaces.Imposto;

public class CalculadoraDeImposto {

	public Double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}
	
}
