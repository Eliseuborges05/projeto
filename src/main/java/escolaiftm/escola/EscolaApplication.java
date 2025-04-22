package escolaiftm.escola;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.repositories.ClientRepository;

//Modifiquei a classe incluindo a implementação da interface
//CommandLineRunner que permite inserir o codigo
@SpringBootApplication
public class EscolaApplication implements CommandLineRunner {
	//Injeção de Dependência da classe ClientRrepository
	//permite ao SpringBoot instanciar objetos da classe
	@Autowired
	private ClientRepository repositorio;
	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setName("Ana");
		cliente.setCpf("15389102681");
		cliente.setIncome(100000.00);
		cliente.setBirthDate(Instant.parse("2005-04-09T04:30:00z"));
		repositorio.save(cliente);
		//cliente.setChildrem();

		Cliente cliente2 = new Cliente(2,Instant.parse("1978-10-09T04:30:00.00Z"), "Jose", "15389504932",12000.00 , "11111", null );
		repositorio.save(cliente2);

		cliente2.setName("Maria");
		repositorio.save(cliente2);

		//repositorio.deleteAll();
		//repositorio.deleteById(2L);
		List<Cliente> clientes = repositorio.findAll();
		System.out.println("Relatório:::::");
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.get(i).getName());
		}

		// utilizando o método de busca por id, que é a chave primaria, ou seja,
		// retorna apenas um elemento
		// ele retorna um objeto Optional, o metodo get() retorna o Client
		Cliente busca = repositorio.findById(2L).get();
		System.out.println("Busca individual:");
		System.out.println(busca.getName());


	}

}
