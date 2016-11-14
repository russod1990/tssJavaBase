/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * Legge un numero in input e stampa se è pari o dispari
 *
 * @author tss
 */
public class PariDispari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabile contenitore per il risultato
        String risultato;
        
        // Crea oggetto standard per leggere input
        Scanner s = new Scanner(System.in);
        
        // Chiede input
        System.out.println("inserisci il numero ");

        // Legge il numero in input
        int numero = s.nextInt();

        // Svolgo l'operazione di verifica pari o dispari (if ternario)
        risultato =(numero%2)==0?"il numero è pari":"il numero è dispari";
        
        // Output da console
        System.out.println(risultato);

    }

}
