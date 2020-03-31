package Atividade_1;

/**
 * @author VINICIUS	
 * Crie uma classe Robo que represente esse personagem contendo dois atributos
 * representando sua posi��o no eixo cartesiano e uma cor que o identifica. Crie um
 * construtor que recebe a cor do rob� e o inicialize na posi��o (0,0). Crie tamb�m
 * m�todos de get e set para as posi��es.
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
	 * Crie um m�todo mover, que recebe como par�metro uma String e altera a posi��o do
     * rob� da seguinte forma:
     * -�up� move o rob� no eixo y em uma posi��o acima.
     * - �down� move o rob� no eixo y em uma posi��o abaixo.
     * - �right� move o rob� no eixo x em uma posi��o para a direita.
     * - �left� move o rob� no eixo x em uma posi��o para a esquerda.
     * Caso o movimento fa�a com que o rob� entre numa zona negativa (x ou y menor que
     * 0), lance a exce��o da quest�o anterior e n�o permita o movimento. Ap�s cada
     * movimento, mostre a posi��o do rob�.
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
			System.out.println("posi��o X = " + this.X + " posi��o Y = " + this.Y);
		}
		
		return 0;
		
	}
	
	/**
	 * 
	 * @param movimento
	 * @return
	 * @throws MovimentoInvalidoExcption
	 * 
	 * Sobrecarregue o m�todo mover, mas ao inv�s de receber uma String, ele recebe como
     * par�metro um inteiro de 1 a 4, onde 1 representa �up�, 2 representa �down�, 3
     * representa �right� e 4 representa �left�
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
			System.out.println("/////////////////////////////Voc� ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Voc� ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Voc� ganhou////////////////////////////////////////");
			System.out.println("/////////////////////////////Voc� ganhou////////////////////////////////////////");
			
			return true;
		}
		return false;
		
	}
	

}
