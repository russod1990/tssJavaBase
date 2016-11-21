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

    private String giocatore;
    private int soldi;

    public void vince() {
        soldi++;
    }

    public void perde() {
        soldi--;
    }
}
