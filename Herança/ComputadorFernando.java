package Herança;

public class ComputadorFernando {
	public static void main(String[] args) {
		
        System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
        System.out.println("\nFACEBOOK");

		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
        System.out.println("\nTELEGRAM");

		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
