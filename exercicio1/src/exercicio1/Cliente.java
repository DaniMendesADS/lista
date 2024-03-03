package exercicio1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Cliente {
	private String nome;
	private String endereco;
	private String cep;
	private String cpf;
	
	public Cliente(String nome, String endereco, String cep, String cpf) {
	this.nome = nome;
	this.endereco = endereco;
	this.cep = cep;
	this.cpf =cpf;
	}



public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getcep() {
	return cep;
}

public void setcep(String cep) {
	this.cep = cep;
}
public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public boolean validarCpf() {
	String regexCPF = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
	return Pattern.matches(regexCPF, cpf);
}
public boolean validarCep() {
	String regexCep = "\\d{5}-\\d{3}";
	Pattern pattern = Pattern.compile(regexCep);
	Matcher matcher = pattern.matcher(cep);
	return matcher.matches();
}
@Override
public String toString() {
	return"Nome: " + nome + "\nEndereço: " + "nCEP: " + cep + "\n";
}
public static void main (String[] args) {
	cadastrarCliente();
}

public static void cadastrarCliente() {
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	System.out.print("Digite o nome do cliente: ");
	String nome = scanner.nextLine();
	
	System.out.print("Digite o endereço do cliente: ");
	String endereco = scanner.nextLine();
	
	System.out.print("Digite o CEP do cliente: ");
	String cep = scanner.nextLine();

	System.out.print("Digite o CPF do cliente: ");
	String cpf = scanner.nextLine();
	
	Cliente cliente = new Cliente(nome, endereco, cep, cpf);
	
	if(cliente.validarCpf() && cliente.validarCep()) {
		System.out.println("Cliente cadastrado com sucesso!!!");
		System.out.println(cliente);
	}else {
		System.out.println("CPF ou CEP inválido. Por favor, verifique!");
	}
	scanner.close();
	}

}




