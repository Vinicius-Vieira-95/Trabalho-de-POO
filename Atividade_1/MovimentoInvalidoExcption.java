package Atividade_1;

/**
 * @author VINICIUS
 * Crie uma exceção chamada MovimentoInvalidoException que informe na mensagem
 * qual movimento foi inválido
 */

public class MovimentoInvalidoExcption extends Exception{

	int num1;
	int num2;
	
	public MovimentoInvalidoExcption(int num1) {
		super();
		this.num1 = num1;
		movimento_invalido();
		
	}
	
	public boolean movimento_invalido() {
		
		if(num1 < 0 ) {
			return false;
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "MovimentoInvalidoExcption";
	}

}
