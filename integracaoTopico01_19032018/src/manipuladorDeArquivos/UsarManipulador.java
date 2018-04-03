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
    }
}
