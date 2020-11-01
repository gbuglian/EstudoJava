package Banco;

public class Main {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.setNumConta(35682);
		c1.setDono("Gabriel Bugliani da Silva");
		c1.abrirConta("CC");
		c1.depositar(100);
		
		
		Conta c2 = new Conta();
		c2.setNumConta(23455);
		c2.setDono("Vilma Aparecida");
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(100);

				
		c1.EstadoConta();
		c2.EstadoConta();

	}

}
