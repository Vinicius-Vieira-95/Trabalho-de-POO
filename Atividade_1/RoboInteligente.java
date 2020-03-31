package Atividade_1;
/**
 * 
 * @author VINICIUS
 * Crie uma subclasse ReboInteligente que sobrescreve o m�todo mover de forma que
 * se rob� fez um movimento inv�lido, garanta que o pr�ximo movimento ser� v�lido. Cria
 * uma classe Main que instancie um rob� normal e outro inteligente, pe�a ao usu�rio para
 * entrar com a posi��o do alimento, e fa�a os dois rob�s se moverem randomicamente,
 * um de cada vez, at� que um deles encontre o alimento. Ao final, mostre quem achou o
 * alimento e o n�mero de movimentos que cada rob� fez.
 *
 */

public class RoboInteligente extends Robo{	
	
	
	
	public RoboInteligente(String cor) {
		super(cor);
	}
	
	@Override
	public int mover(int movimento) throws MovimentoInvalidoExcption{
		
		try {
			
			if(movimento == 0) {
				
				this.Y++;
				if(this.X < 0) {
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return Y;
				}
				return Y;
			}
			else if(movimento == 1) {
				 Y--;
				if(this.Y < 0) {
					this.Y++;
					MovimentoInvalidoExcption y  =  new MovimentoInvalidoExcption(this.Y);
					y.printStackTrace();
					
					return 0;
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
					this.X++;
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

}