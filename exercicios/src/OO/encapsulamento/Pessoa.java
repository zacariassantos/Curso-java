package OO.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(String nome,String sobrenome,int idade) {
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}
	
	
	
	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeCompleto() {
		return getNome()+" "+getSobrenome();
	} 
	
	// getter
	public int getIdade() {
		return idade;
	}
	//setter
	public void setIdade( int novaIdade) {
		novaIdade = Math.abs(novaIdade); // modulo do numero
		if(novaIdade >= 0 && novaIdade <= 120 ) {
			this.idade = novaIdade;	
		}
		
	}
	
	@Override
	public String toString() {
		
		return "Ola eu sou " + getNome()+" "
				+ "tenho e "+getIdade()+" anos";
	}
}
