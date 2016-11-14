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
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Crea oggetto standard per leggere input
        Scanner s = new Scanner(System.in);

        // Chiede input
        System.out.println("inserisci il numero ");

        // Legge il numero in input e dichiarazione variabili per la risoluzione
        String risultato;
        int numero = s.nextInt();
        int c = 1, i = 0;

        // Operazione ciclo while che verifica se il divisore "c" è minore del numero e se il contatore "i" non è maggiore di 2
        while ((c <= numero) && !(i > 2)) {
            // Il numero diviso per il divisore da resto 0?
            if (numero % c == 0) {
                // Incremento contatore "i" per tenere conto di quante volte l'operazione da resto 0
                i = i + 1;
            }
            // Incremento il divisore
            c++;
        }
        // Contatore "i" maggiore di 2? Vero/Falso ed Output console
        risultato = (i > 2) ? "non è un numero primo" : "numero primo";
        System.out.println(risultato);
    }

}
