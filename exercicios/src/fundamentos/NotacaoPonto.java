package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";	
		
		s = s.replace("X", "Senhora");
		
		s = s.toUpperCase();
		
		s = s.concat("!!!");

		System.out.println(s);
		
		String x = "zacck";
		x=x.toUpperCase();
		System.out.println(x);
		
		System.out.println("zack".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X","Zack")
				.toUpperCase()
				.concat("!!!!");
		
		System.out.println(y);
		
		// Tipos primitivos não tem o perador .
	}

}
