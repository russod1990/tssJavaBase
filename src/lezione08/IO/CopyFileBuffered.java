/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tss
 */
public class CopyFileBuffered {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("/tmp/scrivi.txt"));
            bw = new BufferedWriter(new FileWriter("/tmp/prova.txt"));
            String riga;
            while ((riga = br.readLine()) != null) {
                bw.write(riga);
                bw.newLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
