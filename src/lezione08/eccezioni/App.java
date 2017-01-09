/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione08.eccezioni;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tss
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException {
//        String[] righe= {"ciao a tutti", "Tra poco caffè", "Ci vediamo più tardi"};
//        try {
//            AppMetodi.scrivi("/tmp/scrivi.txt", Arrays.asList(righe));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        AppMetodi.scrivi("/tmp/scrivi.txt", Arrays.asList(righe));
//        try {
//            FileReader f = new FileReader("/tmp/test.txt");
//            System.out.println("file trovato e aperto");
//        } catch (FileNotFoundException x) {
//            System.out.println(x.getMessage());
//        }
    AppMetodi.scrivi1("/tmp/prova/xx.txt", new ArrayList<>());
    }
}
