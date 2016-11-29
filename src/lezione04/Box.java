/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class Box {
    
    private Bicycle bici;

    public Bicycle getBici() {
        return bici;
    }

    public void setBici(Bicycle bici) {
        bici.setSpeed(0);
        this.bici = bici;
    }
    
    
    
}
