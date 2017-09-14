/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Lamias extends Hadas{
    private long aleta;
    private int branquias;

    public Lamias() {
    }

    public Lamias(long aleta, int branquias, String nombre, int altura, int edad, long salud, String poder) {
        super(nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public long getAleta() {
        return aleta;
    }

    public void setAleta(long aleta) {
        this.aleta = aleta;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return "Lamias{" + "aleta=" + aleta + ", branquias=" + branquias + '}';
    }
    
}
