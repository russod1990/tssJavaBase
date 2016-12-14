/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07.interfacce;

/**
 *
 * @author tss
 */
public class DemoMultimedia {

    public static void main(String[] args) {
        MultiMedia mm = new CdPlayer();
        mm.play();
        mm.stop();

        MultiMedia mm1 = new Mp3Player();
        mm1.play();
        mm1.stop();
        
        mm.reset();
        mm1.reset();
    }
}
