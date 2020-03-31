package Atividade_1;

import java.util.Random;
import java.util.Scanner;

public class RoboMain03 {

	
	public static void main(String[] args) throws MovimentoInvalidoExcption {
		
		String cor1, cor2;
		int n1, n2;
		int mov1,mov2;
		Random num = new Random();
		Scanner p1 = new Scanner(System.in);
		
		
		
		System.out.printf("escolha a cor do primeiro personagem :");
		cor1 = p1.next();
		Robo robo01 = new Robo(cor1);
		
		System.out.printf("escolha a cor do segundo personagem :");
		cor2 = p1.next();
		RoboInteligente robo02 = new RoboInteligente(cor2);
		
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
