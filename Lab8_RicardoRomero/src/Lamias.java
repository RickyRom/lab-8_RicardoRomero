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
   double aleta, branquias;

    public Lamias() {
        super();
    }

    public Lamias(double aleta, double branquias, String nombre, String edad, double altura) {
        super(nombre, edad, altura);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = "Lamias";
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = 475.0;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = 57.0;
    }

    public double getAleta() {
        return aleta;
    }

    public void setAleta(double aleta) {
        this.aleta = aleta;
    }

    public double getBranquias() {
        return branquias;
    }

    public void setBranquias(double branquias) {
        this.branquias = branquias;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
