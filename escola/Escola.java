package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno fernando = new Aluno();
		fernando.setName("Fernando");
		fernando.setIdade(33);
		
		System.out.println("O aluno " + fernando.getName() + " tem " + fernando.getIdade() + " anos ");	
	}
}
