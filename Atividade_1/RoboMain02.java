package Atividade_1;

import java.util.Random;
import java.util.Scanner;

public class RoboMain02 {
	
	/**
	 *  Crie outra classe Main que instancie dois robôs, peça ao usuário para entrar com a
	 *	posição do alimento, e faça os dois robôs se moverem randomicamente, um de cada vez,
	 *	até que um deles encontre o alimento. Ao final, mostre quem achou o alimento e o
	 *	número de movimentos que cada robô fez. 
	 */

	public static void main(String[] args) throws MovimentoInvalidoExcption {
		
		String cor1, cor2;
		int mov1,mov2;
		Random num = new Random();
		@SuppressWarnings("resource")
		Scanner p1 = new Scanner(System.in);
		
		
		
		System.out.printf("escolha a cor do primeiro personagem :");
		cor1 = p1.next();
		Robo robo01 = new Robo(cor1);
		System.out.printf("escolha a cor do segundo personagem :");
		cor2 = p1.next();
		Robo robo02 = new Robo(cor2);
		System.out.println("Coloque a posição da comida : ");
		mov1 = p1.nextInt();
		mov2 = p1.nextInt();
		robo01.alimento(mov1, mov2);
		robo02.alimento(mov1, mov2);
		

		do {
			
			robo01.mover(num.nextInt(4));
			robo02.mover(num.nextInt(4));	
			
		}
		while(robo01.alimento(mov1, mov2) || robo02.alimento(mov1, mov2) == false );
		
		
		
	}

}
