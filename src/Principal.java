import java.util.*;
public class Principal {
	public static void main(String [] args){
		
		Cliente cliente=new Cliente();
		Medicamento medicamento=new Medicamento();
	    Consulta consulta=new Consulta();
	   
	    Scanner entrada=new Scanner(System.in);
	    
	    // Cadastrar Cliente
        System.out.println("Cadastrar Cliente");
        
	    System.out.println("Nome do cliente");
	    String nome= entrada.nextLine();
       
	    System.out.println("Cpf do cliente");
	    int cpf= entrada.nextInt();
       
	    entrada=new Scanner(System.in);
      
	    System.out.println("Sexo do cliente");
	    String sexo= entrada.nextLine();
       
	    cliente.addCliente(nome, cpf, sexo);
	    
	    //Cadastrar Medicamento
	    System.out.println("Cadastrar Medicamento");
	    
	    entrada=new Scanner(System.in);
	    
	    System.out.println("Nome do Medicamento");
	    String nomeMedicamento= entrada.nextLine();
	    
        entrada=new Scanner(System.in);
	    
	    System.out.println("Descricão do Medicamento");
	    String descricaoMedicamento= entrada.nextLine();
	    
	    medicamento.addMedicamento(nomeMedicamento, descricaoMedicamento);
	    
       
	   //Cadastrar Consulta
	    System.out.println("Cadastrar Consulta");
	    
	    entrada=new Scanner(System.in);
	    
	    System.out.println("Data da Consulta");
	    String data=entrada.nextLine();
		
	    entrada=new Scanner (System.in);
	    
	    System.out.println("Codigoo da Consulta");
	    int codConsulta= entrada.nextInt();
	    
	    consulta.addConsulta(cliente, medicamento, data, codConsulta);
	    
	    System.out.println(consulta);
	}
}
