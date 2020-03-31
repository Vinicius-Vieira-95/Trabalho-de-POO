package Atividade_1;

/**
 * @author VINICIUS	
 * Crie uma classe Robo que represente esse personagem contendo dois atributos
 * representando sua posição no eixo cartesiano e uma cor que o identifica. Crie um
 * construtor que recebe a cor do robô e o inicialize na posição (0,0). Crie também
 * métodos de get e set para as posições.
 */

public class Robo {

	protected String cor;
	protected int X;
	protected int Y;
	
	
	public Robo(String cor) {
		
		this.cor = cor;
		this.X = 0;
		this.Y = 0;
		
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}
	
	/**
	 * Crie um método mover, que recebe como parâmetro uma String e altera a posição do
     * robô da seguinte forma:
     * -“up” move o robô no eixo y em uma posição acima.
     * - “down” move o robô no eixo y em uma posição abaixo.
     * - “right” move o robô no eixo x em uma posição para a direita.
     * - “left” move o robô no eixo x em uma posição para a esquerda.
     * Caso o movimento faça com que o robô entre numa zona negativa (x ou y menor que
     * 0), lance a exceção da questão anterior e não permita o movimento. Após cada
     * movimento, mostre a posição do robô.
	 */
	
	public int mover(String movimento) throws MovimentoInvalidoExcption{
		
		try {
			
			if(movimento.equals("up")) {
				
				this.Y++;
				if(this.Y < 0) {
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return Y;
				}
				return Y;
			}
			else if(movimento.equals("down")) {
				Y--;
				if(this.Y < 0) {
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return Y;
				}
				return Y;
			}
			
			else if(movimento.equals("right")) {
				
				this.X++;
				if(this.X < 0) {
					MovimentoInvalidoExcption x  =  new MovimentoInvalidoExcption(this.X);
					x.printStackTrace();
					
					return X;
				}
				
				return X;
			}
			else if(movimento.equals("left")) {
				
				this.X--;
				if(this.X < 0) {
					MovimentoInvalidoExcption x  =  new MovimentoInvalidoExcption(this.X);
					x.printStackTrace();
					return X;
				}
				return X;
			}
			
		}
		finally {
			System.out.println("posição X = " + this.X + " posição Y = " + this.Y);
		}
		
		return 0;
		
	}
	
	/**
	 * 
	 * @param movimento
	 * @return
	 * @throws MovimentoInvalidoExcption
	 * 
	 * Sobrecarregue o método mover, mas ao invés de receber uma String, ele recebe como
     * parâmetro um inteiro de 1 a 4, onde 1 representa “up”, 2 representa “down”, 3
     * representa “right” e 4 representa “left”
     * 
	 */
	
	public int mover(int movimento) throws MovimentoInvalidoExcption{
		
		try {
			
			if(movimento == 0) {
				
				this.Y++;
				if(this.Y < 0) {
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return Y;
				}
				return Y;
			}
			else if(movimento == 1) {
				 Y--;
				if(this.Y < 0) {
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return Y;
				}
				return Y;
			}
			
			else if(movimento == 2) {
				
				this.X++;
				if(this.X < 0) {
					MovimentoInvalidoExcption x  =  new MovimentoInvalidoExcption(this.X);
					x.printStackTrace();
					
					return X;
				}
				return X;
			}
			else if(movimento == 3) {
				
				this.X--;
				if(this.X < 0) {
					MovimentoInvalidoExcption x  =  new MovimentoInvalidoExcption(this.X);
					x.printStackTrace();
					
					return X;
				}
				return X;
			}
			
			
			
		}
		finally {
			System.out.println("Tartaruga : "+ this.cor + " : " + this.X + " , " + this.Y);
			
		}
		
		return 0;
		
	}
	
	public boolean alimento(int p1, int p2) {
		
		if(this.getX() == p1 && this.getY() == p2) {

			System.out.println(this.cor + " : Venceu  ");
			System.out.println("/////////////////////////////Você ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Você ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Você ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Você ganhou////////////////////////////////////////");
			
			return true;
		}
		return false;
		
	}
	

}
