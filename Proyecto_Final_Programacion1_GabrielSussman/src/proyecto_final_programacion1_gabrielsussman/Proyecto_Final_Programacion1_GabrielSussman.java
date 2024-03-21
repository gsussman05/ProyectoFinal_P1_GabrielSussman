/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_final_programacion1_gabrielsussman;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Proyecto_Final_Programacion1_GabrielSussman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO A MI PROYECTO FINAL DE PROGRAMACION");
        System.out.println("1. SIMULACION DE BANCA EN LINEA");
        System.out.println("2. JUGUEMOS EQUIS-CERO");
        System.out.println("3. VISITA AL VETERINARIO");
        System.out.println("QUE DESEAS HACER EL DIA DE HOY: ");
        int op_menu = sc.nextInt();
        switch (op_menu) {
            case 1:
                Manejo_Cuentas manejadorCuentas = new Manejo_Cuentas();

                while (true) {
                    System.out.println("BINEVENIDO AL BANCO PROGRABAC! CON QUE TE PUEDO AYUDAR");
                    System.out.println("1. REGISTRARSE");
                    System.out.println("2. INICIAR SESION");
                    System.out.println("3. SALIR");

                    int opBanco = sc.nextInt();

                    switch (opBanco) {

                        case 1:

                            System.out.println("Introduce un nombre:");
                            String name = sc.next();

                            System.out.println("Introduce una contraseña (minimo 8 caractéres, al menos una mayúscula, dos números y un caracter especial):");
                            String password = sc.next();
                            boolean esValido = false;

                            /* -------------------------------------------------------------  */
 /* --               Validacion de Password                    --  */
 /* -------------------------------------------------------------  */
                            String digitos = "0123456789";
                            String especiales = "!#$^*@.-+";

                            int conteoNum = 0;
                            int conteoEspeciales = 0;
                            int conteoMay = 0;
                            boolean esNum = false;
                            boolean esEsp = false;

                            for (int i = 0; i < password.length(); i++) {
                                for (int j = 0; j < digitos.length(); j++) {
                                    if (password.charAt(i) == digitos.charAt(j)) {
                                        conteoNum++;
                                        esNum = true;
                                    }
                                }
                                for (int j = 0; j < especiales.length(); j++) {
                                    if (password.charAt(i) == especiales.charAt(j)) {
                                        conteoEspeciales++;
                                        esEsp = true;
                                    }
                                }

                                if (password.charAt(i) == password.toUpperCase().charAt(i) && !esNum && !esEsp) {
                                    conteoMay++;
                                }

                                esNum = false;
                                esEsp = false;
                            }

                            esValido = (password.length() >= 8 && conteoMay >= 1 && conteoEspeciales >= 1 && conteoNum >= 2);

                            /* -------------------------------------------------------------  */
                            if (!esValido) {
                                System.out.println("RECUERDA: La contraseña debe cumplir con los requisitos.");
                                break;
                            }

                            Cuentas nuevaCuenta = new Cuentas(password, name, 0);

                            manejadorCuentas.ingresarCuenta(nuevaCuenta);

                            System.out.println("Cuenta creada con éxito.");

                            break;

                        case 2:

                            System.out.println("Introduce un nombre:");
                            String tuNombre = sc.next();

                            System.out.println("Introduce una contraseña:");
                            String tuPass = sc.next();

                            if (manejadorCuentas.verificarPassdeUsuario(tuNombre, tuPass)) {

                                System.out.println("Bienvenido " + tuNombre);

                                while (true) {

                                    System.out.println("1. HACER UN DEPOSITO");
                                    System.out.println("2. RETIRO DE DINERO");
                                    System.out.println("3. SALIR/LOGOUT");

                                    int opcion2 = sc.nextInt();

                                    if (opcion2 == 1) {

                                        System.out.println("Introduce la cantidad de dinero a depositar:");
                                        double cantidadDepositar = sc.nextDouble();

                                        manejadorCuentas.getContCuentas(manejadorCuentas.getContCuentas() - 1).depositarDinero(cantidadDepositar);

                                        System.out.println("Deposito realizado exitosamente");

                                    } else if (opcion2 == 2) {

                                        System.out.println("Introduce la cantidad de dinero a retirar:");
                                        double cantidadRetirar = sc.nextDouble();

                                        if (manejadorCuentas.getContCuentas(manejadorCuentas.getContCuentas() - 1).retiroDinero(cantidadRetirar)) {
                                            System.out.println("Retiro realizado exitosamente");
                                        } else {
                                            System.out.println("FONDOS INSUFICIENTES");
                                        }
                                    } else if (opcion2 == 3) {

                                        System.out.println("¡Hasta luego!");
                                        break;

                                    } else {
                                        System.out.println("Opción inválida.");
                                    }

                                }

                            } else {
                                System.out.println("NOMBRE O CONTRASEGNIA INCORRECTOS");
                            }

                            break;

                        case 3:

                            System.out.println("¡Hasta luego!");
                            System.exit(0);

                            break;

                        default:
                            System.out.println("Opción inválida.");

                    }

                }
            case 2:
                System.out.println("AHHH, CON QUE QUIERES JUGAR? JUGUEMOS EQUIS-CERO!");
                TicTacToe xo = new TicTacToe();
                xo.setVisible(true);
                break;
            case 3:
                System.out.println("BIENVENIDO A LA VISITA AL VETERINARIO");

                ArrayList<Mascota> mascotas = new ArrayList<>();

                System.out.println("Presione 1 para atender a su mascota");
                int numMascotas = sc.nextInt();

                for (int i = 0; i < numMascotas; i++) {
                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la mascota:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la raza de la mascota:");
                    String raza = sc.nextLine();
                    System.out.println("Ingrese la razón de la visita:");
                    String razonVisita = sc.nextLine();
                    System.out.println("Ingrese el peso de la mascota:");
                    double peso = sc.nextDouble();

                    mascotas.add(new Mascota(nombre, raza, razonVisita, peso));
                }

                System.out.println("Desea agregar otra mascota? (si/no)");
                String respuesta = sc.next();

                while (respuesta.equalsIgnoreCase("si")) {

                    sc.nextLine();
                    System.out.println("Ingrese el nombre de la mascota:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la raza de la mascota:");
                    String raza = sc.nextLine();
                    System.out.println("Ingrese la razón de la visita:");
                    String razonVisita = sc.nextLine();
                    System.out.println("Ingrese el peso de la mascota:");
                    double peso = sc.nextDouble();

                    mascotas.add(new Mascota(nombre, raza, razonVisita, peso));

                    System.out.println("Desea agregar otra mascota? (si/no)");
                    respuesta = sc.next();

                }

                Random rand = new Random();

                System.out.println("ORDEN DE ATENCION");

                for (int i = 0; i < mascotas.size(); i++) {

                    int index = rand.nextInt(mascotas.size());

                    System.out.println((i + 1) + ". " + mascotas.get(index).toString());

                    mascotas.remove(index);

                }

        }

    }

}
