package escolaiftm.escola;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import escolaiftm.escola.entities.Cliente;
import escolaiftm.escola.entities.Matricula;
import escolaiftm.escola.repositories.ClientRepository;
//import escolaiftm.escola.repositories.MatriculaRepository;
import escolaiftm.escola.repositories.MatriculaRepository;
import escolaiftm.escola.service.ClientService;
import escolaiftm.escola.service.MatriculaService;

//Modifiquei a classe incluindo a implementação da interface
//CommandLineRunner que permite inserir o codigo
@SpringBootApplication
public class EscolaApplication implements CommandLineRunner {
	//Injeção de Dependência da classe ClientRrepository
	//permite ao SpringBoot instanciar objetos da classe
	@Autowired
	private ClientRepository repositorio;


	@Autowired
	//private ClientService servicos;
	private MatriculaRepository repositorioMatricula;
	
	@Autowired
	private MatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(EscolaApplication.class, args);
		
	}
	int i = 0;
	int j = 0;
	@Override
	public void run(String... args) throws Exception {
		
		Matricula m1 = new Matricula(null, Instant.parse("2024-01-01T00:00:00Z"), Instant.parse("2024-12-31T00:00:00Z"), "Ativo");
    	Matricula m2 = new Matricula(null, Instant.parse("2023-05-01T00:00:00Z"), null, "Cancelado");
		try {
			matriculaService.insert(m1);
			matriculaService.insert(m2);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro de validação: " + e.getMessage());
		}
		/*Cliente cliente = new Cliente();
		cliente.setName("Ana");
 		cliente.setCpf("00011122222");
 		cliente.setIncome(10000.00);
 		cliente.setChildrem(3);
 		cliente.setBirthDate(Instant.parse("1978-10-09T04:30:00.00Z"));
 		try{
 			servicos.insert(cliente);
		
	    }catch(IllegalArgumentException e){
		   System.out.println("\n"+e.getMessage()+"\n");
	    }
	}
		*/
	
}
}

		
			 //try {
				// Inserir clientes
				//Cliente client1 = new Cliente("Alice", "12345678900", 3000.0,
				//"1985-05-15 00:00:00",3); // dará erro por falta de definição de categoria.
				//clienteService.insert(client1);
				// Testar recomendação de crédito
				//System.out.println(clienteService.recommendCredit(client1.getId()));
 		///}catch(IllegalArgumentException e){
 			//System.out.println("\n"+e.getMessage()+"\n");
 		//}
		// TODO Auto-generated method stub
		/*Cliente cliente = new Cliente();
		cliente.setName("Ana");
		cliente.setCpf("15389102681");
		cliente.setIncome(100000.00);
		cliente.setBirthDate(Instant.parse("2005-04-09T04:30:00z"));
		repositorio.save(cliente);
		//cliente.setChildrem();

		Cliente cliente2 = new Cliente(2,"Jose","15389504932",12000.00 ,Instant.parse("1978-10-09T04:30:00.00Z"),2 );
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

		repositorio.findByChildren(2);
		ArrayList<Cliente> listaClientes = repositorio.findByChildren(2); 
		System.out.println(listaClientes.size());//Quantidade de clientes com dois filhos
		System.out.println("--------Relatório----------");
		for(i =0; i< listaClientes.size(); i++){
			System.out.println(listaClientes.get(i).getName());
		}
		
		/////////////
        //Manipulação da Matrícula
		Matricula matricula = new Matricula();
		matricula.setDatainicio(Instant.parse("2024-02-05T04:30:00z"));
		matricula.setDatafim(Instant.parse("2024-12-10T04:30:00z"));
		matricula.setStatus("Ativo");
		repositorioMatricula.save(matricula);

		Matricula matricula2 = new Matricula(null,Instant.parse("2024-02-05T04:30:00z"),Instant.parse("2024-12-10T04:30:00z"),"Inativo");
		repositorioMatricula.save(matricula2);

		List<Matricula> listamatriculas = repositorioMatricula.findAll();
		System.out.println("----------Data final e Status----------\n");
		for(j = 0; j < listamatriculas.size(); j++){
			System.out.println("ID Matrícula: "+listamatriculas.get(j).getIdmatricula());
			System.out.println("Fim matricula:");
			System.out.println(listamatriculas.get(j).getDatafim());
			System.out.println("Status:");
			System.out.println(listamatriculas.get(j).getStatus());
			System.out.println("\n");
		}
		
		List<Matricula> matriculasAtivas = repositorioMatricula.findByStatusLike("Ativo");
		System.out.println("---------- Matrículas Ativas ----------");
		for(int a = 0; a< matriculasAtivas.size(); a++){
			System.out.print(matriculasAtivas.get(a).getIdmatricula()+" ");
			System.out.println(matriculasAtivas.get(a).getStatus());
		}
		System.out.println("Total: " + matriculasAtivas.size());

		Instant inicio = Instant.parse("2024-04-01T00:00:00Z");
        Instant fim = Instant.parse("2025-12-31T23:59:59Z");
		List<Matricula> matriculasEncontradas = repositorioMatricula.findByDatainicioBetween(inicio, fim);

		if (matriculasEncontradas == null || matriculasEncontradas.isEmpty()) {
			System.out.println("Nenhuma matrícula encontrada entre as datas.");
		}
        System.out.println("\n---------- Matrículas entre datas ----------");
        for (int c = 0; c < matriculasEncontradas.size(); c++) {
            System.out.println("ID: " + matriculasEncontradas.get(c).getIdmatricula());
            System.out.println("Início: " + matriculasEncontradas.get(c).getDatainicio());
            System.out.println("Fim: " + matriculasEncontradas.get(c).getDatafim());
            System.out.println("Status: " + matriculasEncontradas.get(c).getStatus());
            System.out.println("----------------------------------");
		}
	
        // Cria um Instant correspondente a 1º de janeiro de 2025
		Instant inicio2025 = LocalDate.of(2025, 1, 1).atStartOfDay().toInstant(ZoneOffset.UTC);
		Instant inicio2027 = Instant.parse("2027-01-01T12:00:00.00Z");
		Instant termino2028 = Instant.parse("2028-12-30T12:00:00.00Z");
        // Busca todas as matrículas onde dataFim > 2025-01-01
        List<Matricula> matriculas = repositorioMatricula.findByDatafimAfter(inicio2025);

        // Imprime quem são
       matriculas.forEach(matricula2as -> {
           System.out.println("Matrícula ID: " + matricula2as.getIdmatricula() +
                              ", Data Fim: " + matricula2as.getDatafim() +
                               ", Status: " + matricula2as.getStatus());
        });

        // Imprime a quantidade
        System.out.println("Quantidade de matrículas com fim após 2025: " + matriculas.size());

    	matriculas = repositorioMatricula.findByDatainicioGreaterThanAndDatafimLessThan(inicio2027,termino2028);

        // Imprime quem são

		System.out.println("---------------Relatório alunos entre 2027 até 2028-------------------\n\n");
		for (int i = 0; i < matriculas.size(); i++) {
			Matricula mat = matriculas.get(i);
			System.out.println("Matrícula ID: " + mat.getIdmatricula() +
			", Data Fim: " + mat.getDatafim() +
			 ", Status: " + mat.getStatus());
			
		}
		Instant inicio22025 = Instant.parse("2025-01-01T12:00:00.00Z");
		Instant termino2026 = Instant.parse("2026-12-30T12:00:00.00Z");
		matriculas = repositorioMatricula.findByDatainicioGreaterThanAndDatafimLessThanAndStatusLike(inicio22025, termino2026, "Ativo");
		for(int i = 0; i < matriculas.size(); i++){
			Matricula mat6 = matriculas.get(i);
			System.out.println("\nMatricula ID: "+ mat6.getIdmatricula() +
			"\nData Inicio: " + mat6.getDatainicio() + "\nData Fim: " + mat6.getDatafim()+
			"\nStatus: " + mat6.getStatus());
			System.out.println(("Matriculas encontradas" + matriculas.size()));
		}
		Instant inicio2028 = LocalDate.of(2028, 1, 1).atStartOfDay().toInstant(ZoneOffset.UTC);
        Instant fim2028 = LocalDate.of(2028, 12, 31).atTime(23, 59, 59).toInstant(ZoneOffset.UTC);

        List<Matricula> matriculas2028 = repositorioMatricula
        .findByStatusAndDatainicioBetweenOrderByDatainicioAsc("Ativo", inicio2028, fim2028);
		for (int i = 0; i < matriculas2028.size(); i++) {
			Matricula mat6 = matriculas2028.get(i);
			System.out.println("\nMatricula ID: " + mat6.getIdmatricula() +
							   "\nData Início: " + mat6.getDatainicio() +
							   "\nData Fim: " + mat6.getDatafim() +
							   "\nStatus: " + mat6.getStatus());
		}
		
		System.out.println("\nTotal de matrículas ativas iniciadas em 2028: " + matriculas2028.size());
	}
	@Service
 public class ClientService {
     //injeção de dependência
     @Autowired
     private ClientRepository repositorio;
 
     @TransactionScopedonal
     public Cliente insert(Cliente client){
         validateName(client.getName());
         return repositorio.save(client);
         /*
         if (client.getName().length() >=2 && client.getName().length()<=200){
             return repositorio.save(client);
         }else{
             throw new IllegalArgumentException("Nome inválido!!! O nome precisa ter entre 2 e 200 caracteres.");
         }
         */
     
 
    
     
 
	
		


