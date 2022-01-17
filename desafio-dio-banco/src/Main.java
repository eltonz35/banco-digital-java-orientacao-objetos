
public class Main {

	public static void main(String[] args) {
		Cliente elthon = new Cliente();
		elthon.setNome("Elthon");
		
		
		Conta cc = new ContaCorrente(elthon);
		Conta poupanca = new ContaPoupança(elthon);
		
		cc.depositar(100);
		cc.transferir(poupanca, 100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 

	}

}
