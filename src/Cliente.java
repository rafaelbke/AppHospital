
public class Cliente {
 private String nome;
 private int cpf;
 private String sexo;
 
 public void addCliente(String nome, int cpf, String sexo){ // Cadastra um Cliente.
	 
	 this.nome = nome;
	 this.cpf  = cpf;
	 this.sexo = sexo;
	 
	 
 }
 
 public String getNome(){
	 return this.nome;
	 
 }
 
 public int getCpf(){
	 return this.cpf;
	 
 }
 
 public String getSexo(){
	 return sexo;
	 
 }
 
}
