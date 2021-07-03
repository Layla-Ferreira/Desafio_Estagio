package testeestágio;
import java.util.Scanner;
/**
 *
 * @author Layla
 */
public class TesteEstágio {
// Número de pessoas que clicarão no anúncio a cada 1 real investido
   
    private static int NUM_PESSOAS_POR_REAL_INVESTIDO = 30;
    // Percentual de pessoas que clicam no anúncio original (12 / 100 = 0.12 conforme o exemplo)
    private static double PERCENT_CLIQUES_ANUNCIO_ORIGINAL =  0.12;
    // Percentual de pessoas que compartilham o anúncio após visualizar (3 / 20 = 0.15 conforme o exemplo)
    private static double PERCENT_COMPARTI_POR_CLIQUE =  0.15;
    // Quantidade de novas vizualizações à partir de cada compartilhamento
    private static int QUANT_VISUALIZACAO_COMPARTI = 40;
    // Limite de compartilhamento de um anúncio em sequência
    private static int LIMITE_COMPARTILHAMENTO = 4;
  
    public static void main(String[] args) {
     // scan será usado para receber o valor que será investido
     Scanner scan = new Scanner(System.in);
        // O tipo double foi escolhido para melhorar a precisão dos cálculos
        double valorInvestido, 
                numPessoasAnuncioOriginal, 
                numCliques, 
                numCompartilhamentos,
                numVisualizacoesPorCompartilhamento,
                totalPessoas;

        System.out.println("Informe o valor que será investido: ");
        valorInvestido = scan.nextDouble();

        // Calculando estimativas de alcance
        numPessoasAnuncioOriginal = valorInvestido * NUM_PESSOAS_POR_REAL_INVESTIDO;
        numCliques = numPessoasAnuncioOriginal * PERCENT_CLIQUES_ANUNCIO_ORIGINAL;
        numCompartilhamentos = numCliques * PERCENT_COMPARTI_POR_CLIQUE;
        numVisualizacoesPorCompartilhamento = numCompartilhamentos * QUANT_VISUALIZACAO_COMPARTI;
        totalPessoas = numPessoasAnuncioOriginal + numVisualizacoesPorCompartilhamento * LIMITE_COMPARTILHAMENTO;

        // Expressando os valores encontrados
        System.out.println("Alcance do anúncio: \t" + numPessoasAnuncioOriginal +
                           "\nPessoas que clicaram: \t" + numCliques + 
                           "\nNúmero de Compartilhamentos: \t" + numCompartilhamentos + 
                           "\nNúmero de visualizações por compartilhamento: \t" + numVisualizacoesPorCompartilhamento);
        System.out.println("Portanto, o maior número de pessoas que o investimento de R$ " + valorInvestido + 
                " alcançará, será de " + totalPessoas + " pessoas.");
    }
    
}
