/*Atividade01
*Escreva um programa (linha de comandos) que recebe como único argumento um nome 
*de arquivo e exibe os 4 primeiros bytes (inteiro de 32 bits) em formato 
*hexadecimal na saída padrão. Qual o resultado da execução desse programa quando 
*o arquivo de entrada é um arquivo .class (bytecodes)?*/

package atividadesArquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/*import java.util.Scanner;*/

/**
 * @author PALMER
 */
public class Atividade01 {
    
    public static void main( String[] args) {
        
        /*String arquivo;
        
        System.out.println("Forneça o nome do arquivo: ");
        Scanner scan = new Scanner(System.in);
        arquivo = scan.next();*/
                
        try {
            
            /*FileInputStream fis = new FileInputStream(arquivo);*/
            FileInputStream fis = new FileInputStream(args[0]);
            DataInputStream dis = new DataInputStream(fis);
            
            int valor = dis.readInt();
            dis.close();
                        
            System.out.println(Integer.toHexString(valor));
            
        } catch (IOException e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        
    }
}
