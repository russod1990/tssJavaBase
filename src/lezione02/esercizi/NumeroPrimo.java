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

        // Legge il numero in input
        String risultato;
        int numero = s.nextInt();
        int c = 1, i = 0;

        // Operazione
        while ((c <= numero)&&(i<2)) {
            if (numero % c == 0) {
                i = i + 1;
            }
            c++;
        }
        risultato = (i == 2) ? "numero primo" : "non è un numero primo";
        System.out.println(risultato);
    }

}
