package faculdadeUniderp;

public class Cliente {
	
	private String nome;
	private String enderešo;
	
	public Cliente() {
		//super();
	}
	
	
	
	public Cliente(String nome, String enderešo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	
	
	

}
