
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pikachu
 */
public class Dekripsi {

    /**
     *
     * @param file
     * @param processedFile
     * @throws IOException
     */
    public static void dekripsi(InputStream file, OutputStream processedFile)
            throws IOException {
        boolean done =false;
        while(!done)    {
            int pika = file.read();
            if (pika == -1) {
                done = true;
            }   else    {
                byte b = (byte) pika;
                byte c = (byte) (b-12);
                byte d = (byte) (c^29);
                 processedFile.write(c);
            }
        }
       
   
    }
}
