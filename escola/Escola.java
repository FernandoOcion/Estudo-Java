package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setName("Fernando");
		felipe.setIdade(33);
		
		System.out.println("O aluno " + felipe.getName() + " tem " + felipe.getIdade() + " anos ");	
	}
}
