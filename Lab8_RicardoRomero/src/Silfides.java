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
    
    double alas;

    public Silfides() {
        super();
    }

    public Silfides(double alas, String nombre, String edad, double altura) {
        super(nombre, edad, altura);
        this.alas = alas;
        this.setTipo(tipo);
        this.setPoder(poder);
        this.setSalud(salud);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "Silfides";
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = 563.0;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = 67.0;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
