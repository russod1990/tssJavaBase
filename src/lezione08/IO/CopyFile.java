/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author tss
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
        FileInputStream is =null;
        FileOutputStream os=null;
        try {
            is = new FileInputStream("/tmp/scrivi.txt");
            os = new FileOutputStream("/tmp/copia.txt");
            int dato;
            while ((dato = is.read()) != -1) {
                os.write(dato);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (is!=null){
                is.close();
                os.close();
            }
        }
        
    }
}
