package entities;

public class Sequencia {
	public int valor;

	public Sequencia() {
		super();
}
	
	public Sequencia(int valor) {
		this.valor = valor;
}
	
	public static int sequenciaFibonnaci(int valor) {
		if (valor == 0) {
			return 0;
}
		if (valor == 1) {
			return 1;
}
		
	int a = 0;
	int b = 1;
		
		for (int i = 2; i <= valor; i++) {
			int soma = a + b;
			a = b;
			b = soma;
			System.out.println(soma);
		}
		
		if (valor == b) {
			System.out.println("pertence a sequencia");
		} else {
			System.out.println("Nao pertence a sequencia ");
		}
		
		return b;
	}
	
}