package manipuladorDeArquivos;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.io.PrintWriter;

/**
 * Created by jhonypalmer on 26/03/18.
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException,
            UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter(args[0], "UTF-8");
        pw.write(args[1]);
        pw.close();
    }


}
