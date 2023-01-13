package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Zack";
		var sobrenome = " Santos";
		var idade = 23;
		var salario = 123445.987;
		
		
		
		nome = nome.concat(sobrenome);
		
		System.out.println(nome);
		
		System.out.println("Nome: " + nome + "\nSobrenome:"+
		 sobrenome + "\nIdade: " + idade + "\nSalario " + salario + "\n\n");
		
		System.out.printf("Nome: %s tem %d anos , e ganha R$:%.2f",
				nome, idade, salario);
		
		String frase = String.format("\nNome: %s tem %d anos , e ganha R$:%.2f",
				nome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("frase qualquer".contains("qual")); // contem ?
		System.out.println("frase qualquer".indexOf("qual")); // qual indice?
		System.out.println("frase qualquer".substring(6)); // comece pelo indi.
		System.out.println("frase qualquer".substring(6, 8)); // va ate 6 , imprima ate 8
		
		
	}
}
