package Atividade_1;
/**
 * 
 * @author VINICIUS
 * Crie uma subclasse ReboInteligente que sobrescreve o método mover de forma que
 * se robô fez um movimento inválido, garanta que o próximo movimento será válido. Cria
 * uma classe Main que instancie um robô normal e outro inteligente, peça ao usuário para
 * entrar com a posição do alimento, e faça os dois robôs se moverem randomicamente,
 * um de cada vez, até que um deles encontre o alimento. Ao final, mostre quem achou o
 * alimento e o número de movimentos que cada robô fez.
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