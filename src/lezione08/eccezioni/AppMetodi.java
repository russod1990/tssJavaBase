/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.eccezioni;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tss
 */
public class AppMetodi {

    public static FileReader apri(String path) throws FileNotFoundException {

        FileReader f = new FileReader(path);

        return f;
    }

    public static FileReader apri1(String path) {
        return null;
    }

    public static void scrivi(String path, List<String> righe) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(path);
            for (String riga : righe) {
                pw.println(riga);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppMetodi.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.close();
    }

    public static void scrivi1(String path, List<String> righe) {

        try (PrintWriter pw = new PrintWriter(path)) {
            for (int i = 0; i < righe.size(); i++) {
                String riga = righe.get(i);
                pw.println(riga);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AppMetodi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void scrivi2(String path, List<String> righe) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(path);
        for (int i = 0; i < righe.size(); i++) {
            String riga = righe.get(i);
            pw.println(riga);
        }
    }

}
