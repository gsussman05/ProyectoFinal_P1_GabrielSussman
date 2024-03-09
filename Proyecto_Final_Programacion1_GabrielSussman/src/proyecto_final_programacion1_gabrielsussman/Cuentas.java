/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final_programacion1_gabrielsussman;

/**
 *
 * @author Gabriel
 */
public class Cuentas {
    private String pass;
    private String name;
    private double dinero_cuenta;

    public Cuentas(String pass, String name, double dinero_cuenta) {
        this.pass = pass;
        this.name = name;
        this.dinero_cuenta = dinero_cuenta;
    }
    
    public void depositarDinero(double dinero_disp){
        this.dinero_cuenta += dinero_disp;
    }
    public boolean retiroDinero(double dinero_disp){
        if (this.dinero_cuenta>=dinero_disp){
            this.dinero_cuenta -= dinero_disp;
            return true;
        }
        return false;
    }
    public boolean verificarPass(String pass){
        boolean esValida=false;
        if (this.pass.equals(pass)){
            esValida=true;
        }
        return esValida;
    }
    
    public boolean contraValida(){
        int contNums=0;
        int contMayusculas=0;
        int contEspeciales=0;
        for (int i=0; i<this.pass.length(); i++){
            char letra=this.pass.charAt(i);
            if (letra>='0' && letra <='9'){
                contNums++;
            } else if(Character.isUpperCase(letra)){
                contMayusculas++;
            } else if (letra=='*'|| letra=='!'|| letra=='$'){
                contEspeciales++;
            }
        }
        return contNums>=2 && contMayusculas>=1 && contEspeciales>=1;
    }
   
    public String getName(){
        String name=this.name;
        return name;
    }
    public String getContra(){
        return this.pass;
    }
    public double getDineroCuenta(){
        double dinero_cuenta=this.dinero_cuenta;
        return dinero_cuenta;
    }
    
}
