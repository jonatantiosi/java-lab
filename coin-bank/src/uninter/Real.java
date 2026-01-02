package uninter;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Real: " + this.valor);
	}

	@Override
	void converter() {
		this.valorConvertido = this.valor;
		
	}
}