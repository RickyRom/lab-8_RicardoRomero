
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Hadas implements Serializable {
    private String nombre;
    private int altura;
    private int edad;
    private long salud;
    private String poder;
    
    private static final long SerialVersionUID = 15L;

    public Hadas() {
    }

    public Hadas(String nombre, int altura, int edad, long salud, String poder) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getSalud() {
        return salud;
    }

    public void setSalud(long salud) {
        this.salud = salud;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Hadas{" + "nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", salud=" + salud + ", poder=" + poder + '}';
    }
    
}
