/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final_programacion1_gabrielsussman;

/**
 *
 * @author Gabriel
 */
public class Mascota {
    private String nombre;
    private String raza;
    private String razonVisita;
    private double peso;

    public Mascota(String nombre, String raza, String razonVisita, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.razonVisita = razonVisita;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getRazonVisita() {
        return razonVisita;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setRazonVisita(String razonVisita) {
        this.razonVisita = razonVisita;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", raza=" + raza + ", razonVisita=" + razonVisita + ", peso=" + peso + '}';
    }
    
    
}
