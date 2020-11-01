package Banco;

public class Conta {
	//Declarando Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	

	//Declarando Metodos especiais (get, set) e metodos comuns
	
	//Mostrando em tela a conta em seu estado atual
	public void EstadoConta() {
		System.out.println("--------------------------------------------------");
		System.out.println("Conta ativa? " +getStatus());
		System.out.println("Tipo de conta: " +getTipo());
		System.out.println("Conta nº: " +getNumConta());
		System.out.println("Dono: " +getDono());
		System.out.println("Saldo em conta: " +getSaldo());
		System.out.println("--------------------------------------------------");
	}
	
	
	//Metodo para abrir conta
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if(tipo == "CC") {
			setSaldo (50);
		}else if (tipo == "CP") {
			setSaldo (150);
		}	
		System.out.println("Conta aberta com sucesso!");
	}
	
	//Metodo para Fechar conta
	public void fecharConta() {
		if(getSaldo() > 0) {
			System.out.println("ERRO: Não é possível fechar conta com saldo positivo");
		}else if(getSaldo() < 0) {
			System.out.println("ERRO: Não é possivel fechar conta com débitos em aberto");
		}else
			setStatus(false);
			System.out.println("Conta fechadad com sucesso!");
	}

	//Metodo para depositrar na conta
	public void depositar(float valor) {
		if(getStatus() == true) {
			setSaldo(getSaldo() + valor);
			System.out.println("Deposito concluido com sucesso na conta de " +getDono());
		}else 
			System.out.println("ERRO: conta inexistente");
		}
		
	//Metodo para saque
	public void sacar(float valor) {
		if (getStatus() == true) {
			if (getSaldo() > valor) {
				setSaldo (getSaldo() - valor);
				System.out.println("Saque realizado com sucesso na conta de " +getDono());
			} else
				System.out.println("ERRO: Saldo insuficiente");
		} else
			System.out.println("ERRO: Imposivel Sacar, conta inativa");
	}
		
	//Metodo para cobrar mensal
	public void pagarMensal() {
		int valor = 0;
		if (getTipo() == "CC") {
			valor = 12;
		} else if (getTipo() == "CP") {
			valor = 20;
		}
		if (getStatus() == true) {
			setSaldo(getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + getDono());
		} else {
			System.out.println("Erro: Conta fechada");
		}
	}

	//Declarando Constructor
	public Conta() {
		saldo = 0;
		status = false;
	}
	

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {		
		return tipo;
	}
 
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return dono;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	

	public boolean getStatus() {
		return status;
	}
}
	

	


