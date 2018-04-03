package manipuladorDeArquivos;

//@author PALMER
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipularArquivos {
    
    public static boolean CriarArquivo(String caminho, String texto){
       try {
           FileWriter arquivo = new FileWriter(caminho);
           PrintWriter pwarquivo = new PrintWriter(arquivo);
           pwarquivo.println(texto);
           pwarquivo.close();
           return true;
           
       } catch (IOException erro) {
           System.out.println(erro.getMessage());
           return false;
       }
    }
    
    public static String LerArquivo(String caminho){
        
        String texto = "";
        
        try {
        
            FileReader frArquivo = new FileReader(caminho);
            BufferedReader brArquivo = new BufferedReader(frArquivo);
            
            String linha = "";
            linha = brArquivo.readLine();
            
            while( linha != null){
                texto += linha + "\n";
                //System.out.println(linha);
                linha = brArquivo.readLine();            
            }
            
            brArquivo.close();
            frArquivo.close();
            return texto;
            
            
        } catch( IOException erro ){
            System.out.println("Não foi possível ler o arquivo! Error: " + erro.getMessage());
            return "";
        }
    }
}
