/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final_programacion1_gabrielsussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Manejo_Cuentas {

    private Cuentas[] cuenta;
    private int cont_cuentas;

    public Manejo_Cuentas() {
        this.cuenta = new Cuentas[10];
        this.cont_cuentas = 0;
    }

    public void ingresarCuenta(Cuentas cuenta) {
        this.cuenta[cont_cuentas] = cuenta;
        this.cont_cuentas++;
    }

    public boolean cuentaRegistrada(String name) {
        for (int i = 0; i < this.cont_cuentas; i++) {
            if (this.cuenta[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Cuentas verificarValidez(String name, String pass) {
        for (int i = 0; i < this.cont_cuentas; i++) {
            if (this.cuenta[i].getName().equals(name)) {
                return this.cuenta[i];
            }
        }
        return null;

    }
    public boolean verificarPassdeUsuario(String name, String pass){
        for (int i = 0; i < this.cont_cuentas; i++) {
            if (this.cuenta[i].verificarPass(pass)){
                return true;
            }
        }
        return false;
    }
    public int getContCuentas(){
        return this.cont_cuentas;
    }
    public Cuentas getContCuentas(int cont_cuentas){
        return this.cuenta[cont_cuentas];
    }
    
}
