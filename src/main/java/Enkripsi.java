
import java.io.File;
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
public class Enkripsi {
    public static void enkripsi(InputStream file, OutputStream processedFile)
            throws IOException {
        boolean done =false;
        while(!done)    {
            int pika = file.read();
            if (pika == -1) {
                done = true;
            }   else    {
                
                byte b = (byte) pika;
                byte c = (byte) (b^29);
                byte d = (byte) (b+12);
                processedFile.write(c);
            }
        }
       
   
    }
}
