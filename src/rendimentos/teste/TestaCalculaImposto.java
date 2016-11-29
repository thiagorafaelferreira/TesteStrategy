package rendimentos.teste;
import rendimentos.CalculadoraDeImposto;
import rendimentos.Item;
import rendimentos.Orcamento;
import rendimentos.imposto.IHIT;
import rendimentos.interfaces.Imposto;

public class TestaCalculaImposto {

	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new Item("Inversor", 400d));
		orcamento.adicionaItem(new Item("Inversor", 400d));
//		Imposto iss = new ISS();
//		Imposto icms = new ICMS();
//		Imposto iccc = new ICCC();
//		Imposto icpp = new ICPP();
//		Imposto ikcv = new IKCV();
//		Imposto icpptemplate = new ICPPTemplate();
//		Imposto ikcvtemplate = new IKCVTemplate();
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, iss));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, icms));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, iccc));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, icpp));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, ikcv));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, icpptemplate));
//		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, ikcvtemplate));
		Imposto ihit = new IHIT();
		System.out.println(new CalculadoraDeImposto().calculaImposto(orcamento, ihit));
		
	}
}

