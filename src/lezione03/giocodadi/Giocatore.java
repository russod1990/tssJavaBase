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
public class Giocatore {

    private String nome;
    private int soldi;

    public Giocatore(String nomeGiocatore, int soldiGiocatore) {
        nome = nomeGiocatore;
        soldi = soldiGiocatore;
    }

    public void vince() {
        soldi++;
    }

    public void perde() {
        soldi--;
    }

    public void stampa() {
        System.out.println("nome: " + nome + "soldi: " + soldi);
    }

    public int saldo() {
        return soldi;
    }
}
