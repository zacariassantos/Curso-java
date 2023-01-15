package OO.heranca.teste;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		
		Heroi heroi = new Heroi(10,11);
		
		
		System.out.println("Monstro HP:"+monstro.vida);
		System.out.println("Heroi HP:"+heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		System.out.println("Monstro HP:"+monstro.vida);
		System.out.println("Heroi HP:"+heroi.vida);

	
	}
}