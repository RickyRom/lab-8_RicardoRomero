/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Silfides extends Hadas{
    private long alas;

    public Silfides() {
    }

    public Silfides(long alas, String nombre, int altura, int edad, long salud, String poder) {
        super(nombre, altura, edad, salud, poder);
        this.alas = alas;
    }

    public long getAlas() {
        return alas;
    }

    public void setAlas(long alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return "Silfides{" + "alas=" + alas + '}';
    }
    
    
}