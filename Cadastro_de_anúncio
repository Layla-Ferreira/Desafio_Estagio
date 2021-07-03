package main;

/**
 *
 * @author Layla
 */
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    
        private Scanner l;
	private boolean execute;
	private List<Dados> dados;
        
    
    public static void main(String[] args) {
            Main main = new Main(); 
       
    }
   
    private Main() {
		l = new Scanner(System.in);
		execute = true;
		dados = new ArrayList<>();
                 
		System.out.println("BEM VINDO AO CADASTRO DE ANÚNCIOS");

		while (execute) {
			String opcao = menu();

			if (opcao.equalsIgnoreCase("1")) {
				cadastrar();
			} else if (opcao.equalsIgnoreCase("2")) {
				listarCadastros();
			} else if (opcao.equalsIgnoreCase("0")) {
                            System.out.println("Saindo........");
				execute = false;
			} else {
				System.out.println("\nOpção Inválida  \n");
			}
		}
	}

	private String menu() {
		System.out.println("Selecione a opção:");
		System.out.println("1 - Realizar cadastro");
		System.out.println("2 - Listar cadastros");
		System.out.println("0 - Sair");
		return l.nextLine();
	}

	private void cadastrar() {
		boolean cadastrando = true;

		while (cadastrando) {
			System.out.println("Cadastro de Usuário");
			Dados d = new Dados();
			d.setNome_do_anúncio(textInput("Nome do anúncio: "));
			d.setCliente(textInput("Nome Cliente: "));
			d.setData_de_inicio(textInput("Data_de_inicio: ")); 
                        d.setData_de_término(textInput("Data_de_término: ")); 
                        d.setInv_por_Dia(textInput("Informe o valor que será investido: "));
			String cadastrar = textInput("Adicionar cadastro (S/N) ?");
			if (cadastrar.equalsIgnoreCase("s")) {
				System.out.println("Cadastro adicionado !!!");
				dados.add(d);
			} else if (cadastrar.equalsIgnoreCase("n")){
				System.out.println("Cadastro ignorado !!!");
			} else {
				System.out.println("\nOpção inválida \n");
			}

			String continua = textInput("Continuar cadastrando (S/N) ?");
			if (continua.equalsIgnoreCase("N")) {
				cadastrando = false;
			} else if (continua.equalsIgnoreCase("s")){
				// se for s sai do if e volta para o inicio do while
			} else {
				System.out.println("\nOpção inválida \n");
				cadastrando = false;
			}
		}
	}

	private void listarCadastros() {
		if (dados.isEmpty()) {
			System.out.println("\nNão existem cadastros !!!\n");
		} else {
			System.out.println("\nLista de Cadastros\n");
			for (int i = 0; i < dados.size(); i++) {
				Dados d = dados.get(i);
				System.out.println("Cadastro número: " + i);
				System.out.println("\tNome do anúncio: " + d.getNome_do_anúncio());
				System.out.println("\tNome Cliente: " + d.getCliente());
                                System.out.println("\tData_de_inicio " + d.getData_de_inicio());
                                System.out.println("\tData_de_término " + d.getData_de_término());
				System.out.println("\tInv_por_Dia: " + d.getInv_por_Dia());
			}
			System.out.println("\nFim da lista\n");
		}
	}

	private String textInput(String label) {
		System.out.println(label);
		return l.nextLine();
	}
}
