package Atividade_1;

import java.util.Random;
import java.util.Scanner;

public class MainRobo {
	
	/**
	 *  Crie uma classe Main que instancie um robô, peça ao usuário para determinar a
	 *	posição do alimento, e peça ao usuário para ficar movendo o robô até ele encontrar o
	 *	alimento – não esqueça de tratar a exceção
	 */

	public static void main(String[] args) throws MovimentoInvalidoExcption {
		
		String cor;
		int n2,n3;
		Random num = new Random();
		int[][] matriz = new int[5][5];
		
		
		@SuppressWarnings("resource")
		Scanner robo = new Scanner(System.in);
		
		System.out.printf("Escolha a cor do seu robô: ");
		cor = robo.next();
		Robo a1 = new Robo(cor);
		System.out.println("Coloque a posição da comida");
		n2 = robo.nextInt();
		n3 = robo.nextInt();
		a1.alimento(n2, n3);
		
		do {
			
			a1.mover(num.nextInt(4));
			a1.alimento(n2, n3);
			
		}
		while(a1.alimento(n2, n3) == false);
	}

}
