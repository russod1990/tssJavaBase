/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class PariDispariAlternativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Variabili contenitore per il risultato
        String risultato;
        int c = 0;
        // Crea oggetto standard per leggere input
        Scanner s = new Scanner(System.in);

        // Chiede input
        System.out.println("inserisci il numero ");

        // Legge il numero in input
        int numero = s.nextInt();

        // Svolgo l'operazione di verifica pari o dispari (if ternario)
        while (c < numero) {
            c = 2 + c;
        }
        risultato = (c == numero) ? "il numero è pari" : "il numero è dispari";
        // Output da console
        System.out.println(risultato);
    }

}
