package OO.encapsulamento;

public class PessoaTeste {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("zack","Santos",-45);
	//p1.idade = -30; // alterar 
	
	p1.setIdade(250); // idade alterada a partir do metodo
	
	System.out.println(p1.getIdade());
	System.out.println(p1);// toString
	System.out.println(p1.getNomeCompleto());
}
}