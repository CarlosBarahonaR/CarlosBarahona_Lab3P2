/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_lab3p2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CarlosBarahona_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        // TODO code application logic here
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido a Hugo\n"
                    + "¿Qué desea hacer?\n"
                    + "1) Iniciar sesión\n"
                    + "2) Registrarse\n"
                    + "3) Salir");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                }

            }
        }
    }
}
