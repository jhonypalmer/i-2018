/*
 * Escreva um programa (linha de comandos) que exibe o conteúdo de arquivo texto, 
*formato UTF-8, na saída padrão. O único argumento é o nome do arquivo a ser exibido.
 */
package atividadesArquivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author PALMER
 */
public class Atividade03 {
   
    public static void main(String[] args){
        
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            InputStreamReader inReader = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(inReader);

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            br.close();

        } catch (IOException e) {
            System.out.printf("Error: %s.\n",
                    e.getMessage());
        }
        
    }
    
}
