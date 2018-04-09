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
import static java.lang.ProcessBuilder.Redirect.Type.WRITE;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardOpenOption.CREATE;

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
        
        String conteudoBin = "";
        try {
        
            FileInputStream fin = new FileInputStream(caminhoBin);
            DataInputStream din = new DataInputStream(fin);
            
            conteudoBin = din.readUTF();
            return conteudoBin;
                        
        } catch( IOException e ){
            //System.out.println("Error: " + e.getMessage());
            return conteudoBin;
        }        
    }
    
    /*public static Boolean CriarArquivoBuffer(String caminho, String conteudo) {
        
        try {
        
            Path arquivo = Paths.get(caminho);
            int valor = Integer.parseInt(conteudo);

            ByteBuffer buffer = ByteBuffer.allocate(10);
            buffer.putInt(valor);
            buffer.flip();

            FileChannel fc = FileChannel.open(arquivo, CREATE, WRITE);
            fc.write(buffer);
            fc.close();
            
            return true;
        
        } catch ( IOException e ) {
            return false;
        }
        
    }*/
        
}
