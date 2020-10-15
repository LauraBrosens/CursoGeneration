package exercícios;

public class ContaBancaria {
	private int agencia, agenciaDigito, conta, contaDigito;
	private double saldo;
	private String nomeTitular, sobrenomeTitular;  
	
	public static void main (String[] args) {
		ContaBancaria contaM = new ContaBancaria (5001, 0, 546782, 9, 10503.71, "Mariana", "Souza");
		ContaBancaria contaC = new ContaBancaria (5001, 0, 546799, 3, 2753.27, "Carlos", "Souza");
		String nomeM = contaM.obterNome();
		String nomeC = contaC.obterNome();
		String agenciaC = contaC.obterAgencia();
		String conta = contaC.obterConta();
		double saldoM = contaM.obterSaldo();
		
		System.out.println("Os nomes de nossos clientes são: "+ nomeM + " e " + nomeC +"."
				+ "\nA Agencia de "+nomeC+" é "+ agenciaC +" e a conta é " + conta + ". "
				+ "\nO saldo da conta de "+nomeM+" é de R$"+saldoM);
	}
	
	
	public ContaBancaria (int agencia, int agenciaDigito, int conta, int contaDigito, double saldo, String nomeTitular, String sobrenomeTitular) {
		this.agencia = agencia;
		this.agenciaDigito = agenciaDigito; 
		this.conta = conta;
		this.contaDigito = contaDigito;
		this.saldo = saldo;
		this.nomeTitular = nomeTitular;
		this.sobrenomeTitular = sobrenomeTitular;
	}
	public double obterSaldo () {
		return this.saldo;
	}
	public String obterNome() {
		String nome = this.nomeTitular + " " + this.sobrenomeTitular;
		return nome;
	}
	public String obterAgencia() {
		String agencia = this.agencia + "-" + this.agenciaDigito;
		return agencia;
	}
	public String obterConta() {
		String conta = this.conta + "-" + this.contaDigito;
		return conta;
	}
}
