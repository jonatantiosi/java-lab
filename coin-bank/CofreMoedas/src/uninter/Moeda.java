package uninter;

public abstract class Moeda {
	
	double valor;
	double valorConvertido;
	
	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	//metodos abstratos implantados propriamente nas classes filhas Euro, Real, Dolar
	abstract void info();
	abstract void converter();
}

 