package uninter;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	
	public void listagemMoedas() {
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		} 
	}
	
	public void adicionar(Moeda moeda) {
		// adiciona tipos de moeda Dolar,Euro,Real
		listaMoedas.add(moeda);
	}
	
	public void remover(double valor, int tipoMoeda) {
		// verifica se existe uma moeda de um tipo e valor especifico para poder removela da lista de moedas
	    for (int i = 0; i < listaMoedas.size(); i++) {
	        Moeda moeda = listaMoedas.get(i);

	        if ((tipoMoeda == 1 && moeda instanceof Real) ||
	            (tipoMoeda == 2 && moeda instanceof Euro) ||
	            (tipoMoeda == 3 && moeda instanceof Dolar)) {

	            if (moeda.valor == valor) {
	                listaMoedas.remove(i);
	                System.out.println("Moeda removida");
	            }
	            else {
	                System.out.println("Moeda não encontrada");
	  	        }
	        }
	       
	    }
	}
	
	public double totalConvertido(){
		// usa a funcao propria de cada tipo de moeda para converter para reais e retornar a soma de tudo
		double totalReais = 0;
		for (Moeda moeda : listaMoedas) {
			moeda.converter();
			totalReais += moeda.valorConvertido;
		}
		return totalReais;
	}
}


