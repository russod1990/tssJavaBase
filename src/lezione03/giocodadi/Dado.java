/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.giocodadi;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado {

    private int numeroFacce;

    public Dado(int facce) {
        numeroFacce = facce;
    }

    public int lancio() {
        Random rnd= new Random();
        return rnd.nextInt(numeroFacce)+1;
    }
}
