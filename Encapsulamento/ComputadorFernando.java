package Encapsulamento;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorFernando {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}
