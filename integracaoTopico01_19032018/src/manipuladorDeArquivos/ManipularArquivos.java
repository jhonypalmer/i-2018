package manipuladorDeArquivos;

//@author PALMER
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
           System.out.println("Erro na criação do arquivo - " + erro.getMessage());
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
    
    public static boolean CriarArquivoBin(String caminho, String texto){
    
        try {
            FileOutputStream fout = new FileOutputStream(caminho);
            DataOutputStream dout = new DataOutputStream(fout);
            
            dout.writeUTF(texto);
                       
            dout.close();
            fout.close();
            return true;
        
        } catch( FileNotFoundException e){
            
            //System.out.println("Error: " + e.getMessage());
            return false;
            
        } catch ( IOException e){
            
            //System.out.println("Error: " + e.getMessage());
            return false;
        }        
    }
    
    public static String LerArquivoBin(String caminhoBin) {
        
        String textoBin = "";
        try {
        
            FileInputStream fin = new FileInputStream(caminhoBin);
            DataInputStream din = new DataInputStream(fin);
            
            textoBin = din.readUTF();
            return textoBin;
                        
        } catch( IOException e ){
            //System.out.println("Error: " + e.getMessage());
            return textoBin;
        }
        
    }
        
}
