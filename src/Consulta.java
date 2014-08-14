
public class Consulta {
	
	private Cliente cliente;
	private Medicamento medicamento;
    private String data;
    private int codConsulta;
    
    public void addConsulta(Cliente cliente, Medicamento medicamento, String data, int codConsulta){
    	
    	this.cliente=cliente;
    	this.medicamento=medicamento;
    	this.data=data;
    	this.codConsulta=codConsulta;
    	  	System.out.println();
    	
    }

	public String toString() {
		return "Consulta [cliente=" + cliente.getNome()+cliente.getCpf()+cliente.getSexo() + ", medicamento=" + medicamento
				+ ", data=" + data + ", codConsulta=" + codConsulta
				+ ", toString()=" + super.toString() + "]";
	}

   

}
