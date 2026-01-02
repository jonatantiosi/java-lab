package uninter;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Dolar: " + this.valor);
	}
	
	@Override
	void converter() {
		// conversao com base na cotacao atual de aproximadamento 5,40 reais por Dolar
		this.valorConvertido = this.valor * 5.40;
		
	}

}
