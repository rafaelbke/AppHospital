
public class Medicamento {

	private String nome;
	private String descricao;
	
	public void addMedicamento(String nome, String descricao){ //Cadastra um medicamento.
		this.nome=nome;
		this.descricao=descricao;
		
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
