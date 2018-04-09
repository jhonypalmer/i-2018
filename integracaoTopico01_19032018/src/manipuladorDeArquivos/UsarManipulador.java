package manipuladorDeArquivos;

/**
 * Created by jhonypalmer on 26/03/18.
 */
public class UsarManipulador {

    public static void main(String[] args) {
       
        String caminho = "arquivo.txt";
        
        //GRAVA TEXTO NO ARQUIVO
        String texto = "Ementa - Integração de Aplicações\n" +
                       "Definição de integração de aplicações. \n" + 
                       "Desafios de integração. Abordagens de integração \n" +
                       "(transferência de arquivos, bases de dados compartilhadas, \n" + 
                       "chamada de procedimento remoto e troca de mensagens).\n" + 
                       "Padrões para integração de aplicações.\n";
        
        
        //CRIAR ARQUIVO
        if(ManipularArquivos.CriarArquivo(caminho, texto)) {
            System.out.println("Arquivo criado com sucesso!");
        } else {
            System.out.println("Erro ao criar arquivo!");
        }
        
        //LEITURA DO ARQUIVO
        
        String lerArquivo = ManipularArquivos.LerArquivo(caminho);
        if(lerArquivo.isEmpty()){
            System.out.println("Arquivo vazio!");
        } else {
            System.out.println("\n"+lerArquivo);
        }
        
        //ARQUIVOS BINARIOS
        
        String caminhoBin = "arquivoBin.bin";
        //String textoBin = "";
        String textoBin = "Visão geral\n" +
                          "A disciplina é de natureza prática e concentra-se \n" +
                          "em aspectos técnicos relevantes para a integração \n" +
                          "de aplicações, que é um tópico corrente e típico \n" + 
                          "de organizações que produzem e fazem uso de software.\n";
                          
        
        //CRIAR ARQUIVO BINARIO
        if(ManipularArquivos.CriarArquivoBin(caminhoBin, textoBin)) {
            System.out.println("Arquivo Binário Criado - ArqBin\n");
        } else {
            System.out.println("Erro ao Criar Arquivo Binário!");
        }
        
        //LER ARQUIVO BINARIO
        
        String lerArquivoBin = ManipularArquivos.LerArquivoBin(caminhoBin);
        if(lerArquivoBin.isEmpty()){
            System.out.println("Arquivo Binário vazio!");
        } else {
            System.out.println("\n"+lerArquivoBin);
        }
    }
}
