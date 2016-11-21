/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.giocodadi;

/**
 *
 * @author tss
 */
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Giocatore g = new Giocatore("Rossi", 100);

        Dado gDado = new Dado(6);
        Dado bDado = new Dado(6);
        int contatore=0;

        while (g.saldo() > 0) {
            int lancioGiocatore = gDado.lancio();
            int lancioBanco = bDado.lancio();
            if (lancioGiocatore > lancioBanco) {
                g.vince();
            } else {
                g.perde();
            }
            contatore++;
            System.out.println(contatore + " # risultato lancio: - giocatore = "+ lancioGiocatore + " - banco = "+ lancioBanco + " - saldo = "+g.saldo());
        }
    }

}
