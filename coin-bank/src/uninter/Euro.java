package uninter;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Moeda Euro: " + this.valor);
	}

	@Override
	void converter() {
		// conversao com base na cotacao atual de aproximadamento 6,35 reais por Euro
		this.valorConvertido = this.valor * 6.35;
		
	}

}