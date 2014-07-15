package br.com.pedidomania.teste;

public class Teste2 {
	
	private boolean teste;

	public boolean isTeste() {
		return teste;
	}
	public void setTeste(boolean teste) {
		this.teste = teste;
	}
	public void validaClasse(int x){
		if(x != 0){
			this.teste = true;
		}
	}
	
	

}
