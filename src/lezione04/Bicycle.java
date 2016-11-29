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
public class Bicycle {

    private int speed;
    private int gear;
    private static int numeroIstanze;

    static {
        numeroIstanze = 0;
    }

    public Bicycle(int speed, int gear) {
        this.gear = gear;
        this.speed = speed;
        numeroIstanze++;
    }

    public Bicycle() {
        this(1, 1);
    }

    public Bicycle(int speed) {
        this(speed, 1);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }
}
