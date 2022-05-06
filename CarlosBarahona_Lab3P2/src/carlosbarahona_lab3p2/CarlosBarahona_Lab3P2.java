/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_lab3p2;

import java.util.ArrayList;
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
        ArrayList<Residencial> residenciales = new ArrayList();
        ArrayList<Cliente> clientes = new ArrayList();
        // TODO code application logic here
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido a Bienes y raíces\n"
                    + "¿Qué desea hacer?\n"
                    + "1) CRUD\n"
                    + "2) Comprar una propiedad\n"
                    + "3) Salir");
            opcion = r.nextInt();
            switch (opcion) {
                case 1: {
                    int opcion2 = 0;
                    while (opcion2 != 15) {
                        System.out.println("Bienvenido al CRUD\n"
                                + "¿Qué desea hacer?\n"
                                + "1) Crear Residencial\n"
                                + "2) Crear Usuario\n"
                                + "3) Crear casa\n"
                                + "4) Modificar casa\n"
                                + "5) Listar casas\n"
                                + "6) Eliminar casa\n"
                                + "7) Crear apartamento\n"
                                + "8) Modificar apartamento\n"
                                + "9) Listar apartamentos\n"
                                + "10) Eliminar apartamento\n"
                                + "11) Crear edificio\n"
                                + "12) Modificar edificio\n"
                                + "13) Listar edificios\n"
                                + "14) Eliminar edificio\n"
                                + "15) Salir");
                        opcion2 = r.nextInt();
                        switch (opcion2) {
                            case 1: {
                                System.out.println("Ingrese el nombre de la residencial");
                                String nombre = r.nextLine();
                                nombre += r.nextLine();
                                ArrayList<BienesInmuebles> bienes = new ArrayList();
                                residenciales.add(new Residencial(bienes, nombre));
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese el nombre del cliente");
                                String nombre = r.nextLine();
                                nombre += r.nextLine();
                                System.out.println("Ingrese la edad del cliente");
                                int edad = r.nextInt();
                                System.out.println("Ingrese el ID en registro del cliente");
                                String ID = r.next();
                                System.out.println("Ingrese el usuario del cliente");
                                String usuario = r.next();
                                System.out.println("Ingrese la contraseña del cliente");
                                String contraseña = r.next();
                                ArrayList<BienesInmuebles> bienes = new ArrayList();
                                clientes.add(new Cliente(nombre, edad, ID, usuario, contraseña, bienes));
                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese la dirección de la casa");
                                String direccion = r.nextLine();
                                direccion += r.nextLine();
                                System.out.println("Ingrese las dimensiones del terreno de la casa");
                                String dimensiones = r.nextLine();
                                dimensiones += r.nextLine();
                                System.out.println("Ingrese el ID único de su casa");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    int verificicarID = 0;
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                            verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }

                                        while (idUnico == verificicarID) {
                                            System.out.println("Ingrese un ID de casa que no este tomado");
                                            idUnico = r.nextInt();
                                        }
                                    }

                                }
                                System.out.println("Ingrese el numero de la casa");
                                int numCasa = r.nextInt();

                                Residencial residencial = null;
                                int posicionResidencial = 0;
                                String nombreResidencial = "";
                                while (residencial == null) {
                                    System.out.println("Ingrese el nombre de la residencial a la cual pertenece la casa");
                                    nombreResidencial = r.nextLine();
                                    nombreResidencial += r.nextLine();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        String residencialAgregar = "";

                                        residencialAgregar = ((Residencial) residenciales.get(x)).getNombreResidencial();

                                        if (nombreResidencial.equals(residencialAgregar)) {
                                            residencial = residenciales.get(x);
                                            posicionResidencial = x;

                                        } else {

                                        }

                                    }

                                }

                                ArrayList<BienesInmuebles> bienes = new ArrayList();
                                residenciales.get(posicionResidencial).getBienesInmuebles().add(new Casa(numCasa, nombreResidencial, direccion, dimensiones, idUnico, residencial));
                                break;
                            }
                            case 4: {
                                System.out.println("Ingrese el ID único de la casa para modificarla");
                                int ID2 = r.nextInt();
                                int item2 = 0;
                                int posResidencial = 0;
                                for (int x = 0; x < residenciales.size(); x++) {

                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        int ID = 0;
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Casa) {
                                            ID = ((Casa) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }
                                        if (ID2 == ID) {
                                            item2 = i;
                                            posResidencial = x;
                                            i = residenciales.get(x).getBienesInmuebles().size();
                                            x = residenciales.size();
                                        } else {
                                            item2 = 10000;
                                        }
                                    }
                                }
                                if (item2 != 10000) {
                                    System.out.println("Ingrese la nueva dirección de la casa");
                                    ((Casa) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDireccion(r.nextLine());
                                    System.out.println("Ingrese las nueva dimensiones de la casa");
                                    ((Casa) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDimensionesTerreno(r.nextLine());
                                    System.out.println("Ingrese el nuevo ID único de la casa");
                                    int idUnico = r.nextInt();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        int verificicarID = 0;
                                        for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                                verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                            }

                                            while (idUnico == verificicarID) {
                                                System.out.println("Ingrese un ID de casa que no este tomado");
                                                idUnico = r.nextInt();
                                            }
                                        }

                                    }
                                    ((Casa) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setID(idUnico);
                                    System.out.println("Ingrese el nuevo numero de la casa");
                                    ((Casa) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setNumCasa(r.nextInt());

                                    break;

                                } else {
                                    System.out.println("No se encontro la casa que ingresó");

                                }

                            }
                            case 5: {
                                for (int n = 0; n < residenciales.size(); n++) {

                                    for (int i = 0; i < residenciales.get(n).getBienesInmuebles().size(); i++) {

                                        if (residenciales.get(i).getBienesInmuebles().get(i) instanceof Casa) {
                                            System.out.println(residenciales.get(i).getBienesInmuebles().get(i));
                                        }

                                    }

                                }
                                break;
                            }
                            case 6: {
                                System.out.println("Ingrese el ID único de la casa que desea eliminar");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Casa) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i).getID() == idUnico) {
                                                residenciales.get(x).getBienesInmuebles().remove(i);
                                                i = residenciales.get(x).getBienesInmuebles().size();
                                                x = residenciales.size();
                                            } else {
                                                System.out.println("No se encontro la casa que ingresó");

                                            }

                                        }

                                    }

                                }
                                break;
                            }
                            case 7: {
                                System.out.println("Ingrese la dirección del apartemento");
                                String direccion = r.nextLine();
                                direccion += r.nextLine();
                                System.out.println("Ingrese las dimensiones del terreno del apartemento");
                                String dimensiones = r.nextLine();
                                dimensiones += r.nextLine();
                                System.out.println("Ingrese el ID único del apartemento");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    int verificicarID = 0;
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                            verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }

                                        while (idUnico == verificicarID) {
                                            System.out.println("Ingrese un ID de casa que no este tomado");
                                            idUnico = r.nextInt();
                                        }
                                    }

                                }
                                System.out.println("Ingrese el numero local del apartemento");
                                int numApartemento = r.nextInt();

                                Residencial residencial = null;
                                int posicionResidencial = 0;
                                String nombreResidencial = "";
                                while (residencial == null) {
                                    System.out.println("Ingrese el nombre de la residencial a la cual pertenece el apartemento");
                                    nombreResidencial = r.nextLine();
                                    nombreResidencial += r.nextLine();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        String residencialAgregar = "";

                                        residencialAgregar = ((Residencial) residenciales.get(x)).getNombreResidencial();

                                        if (nombreResidencial.equals(residencialAgregar)) {
                                            residencial = residenciales.get(x);
                                            posicionResidencial = x;

                                        } else {

                                        }

                                    }

                                }
                                Edificio edificio = null;
                                int posicionEdificio = 0;
                                int posicionREdificio = 0;
                                String nombreEdificio = "";
                                while (edificio == null) {
                                    System.out.println("Ingrese el nombre del edificio al cual pertenece el apartemento");
                                    nombreEdificio = r.nextLine();
                                    nombreEdificio += r.nextLine();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        String edificioAgregar = "";
                                        for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {

                                            if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Edificio) {
                                                edificioAgregar = ((Edificio) residenciales.get(x).getBienesInmuebles().get(i)).getNombre();
                                            }

                                            if (nombreEdificio.equals(edificioAgregar)) {
                                                edificio = ((Edificio) residenciales.get(x).getBienesInmuebles().get(i));
                                                posicionEdificio = i;
                                                posicionREdificio = x;

                                                i = residenciales.get(x).getBienesInmuebles().size();
                                                x = residenciales.size();
                                            }
                                        }

                                    }

                                }

                                residenciales.get(posicionResidencial).getBienesInmuebles().add(new Apartamento(numApartemento, nombreEdificio, direccion, dimensiones, idUnico, residencial));
                                ((Edificio) residenciales.get(posicionREdificio).getBienesInmuebles().get(posicionEdificio)).getApartamentos().add(new Apartamento(numApartemento, nombreEdificio, direccion, dimensiones, idUnico, residencial));
                                ((Edificio) residenciales.get(posicionREdificio).getBienesInmuebles().get(posicionEdificio)).setCantidadLocales(+1);

                                break;
                            }
                            case 8: {
                                System.out.println("Ingrese el ID único del apartamento para modificarlo");
                                int ID2 = r.nextInt();
                                int item2 = 0;
                                int posResidencial = 0;
                                for (int x = 0; x < residenciales.size(); x++) {

                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        int ID = 0;
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Apartamento) {
                                            ID = ((Casa) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }
                                        if (ID2 == ID) {
                                            item2 = i;
                                            posResidencial = x;
                                            i = residenciales.get(x).getBienesInmuebles().size();
                                            x = residenciales.size();
                                        } else {
                                            item2 = 10000;
                                        }
                                    }
                                }
                                if (item2 != 10000) {
                                    System.out.println("Ingrese la nueva dirección del apartemento");
                                    ((Apartamento) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDireccion(r.nextLine());
                                    System.out.println("Ingrese las nueva dimensiones del apartemento");
                                    ((Apartamento) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDimensionesTerreno(r.nextLine());
                                    System.out.println("Ingrese el nuevo ID único del apartemento");
                                    int idUnico = r.nextInt();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        int verificicarID = 0;
                                        for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                                verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                            }

                                            while (idUnico == verificicarID) {
                                                System.out.println("Ingrese un ID del apartemento que no este tomado");
                                                idUnico = r.nextInt();
                                            }
                                        }

                                    }
                                    ((Apartamento) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setID(idUnico);
                                    System.out.println("Ingrese el nuevo numero de local del apartemento");
                                    ((Apartamento) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setNumLocal(r.nextInt());

                                    break;

                                } else {
                                    System.out.println("No se encontro el apartemento que ingresó");

                                }
                                break;
                            }
                            case 9: {
                                for (int n = 0; n < residenciales.size(); n++) {

                                    for (int i = 0; i < residenciales.get(n).getBienesInmuebles().size(); i++) {

                                        if (residenciales.get(i).getBienesInmuebles().get(i) instanceof Apartamento) {
                                            System.out.println(residenciales.get(i).getBienesInmuebles().get(i));
                                        }

                                    }

                                }
                                break;
                            }
                            case 10: {
                                System.out.println("Ingrese el ID único del apartamento que desea eliminar");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Apartamento) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i).getID() == idUnico) {
                                                residenciales.get(x).getBienesInmuebles().remove(i);
                                                i = residenciales.get(x).getBienesInmuebles().size();
                                                x = residenciales.size();
                                            } else {
                                                System.out.println("No se encontro el apartamento que ingresó");

                                            }

                                        }

                                    }

                                }
                                break;
                            }
                            case 11: {
                                System.out.println("Ingrese la dirección del edificio");
                                String direccion = r.nextLine();
                                direccion += r.nextLine();
                                System.out.println("Ingrese las dimensiones del terreno del edificio");
                                String dimensiones = r.nextLine();
                                dimensiones += r.nextLine();
                                System.out.println("Ingrese el ID único del edificio");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    int verificicarID = 0;
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                            verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }

                                        while (idUnico == verificicarID) {
                                            System.out.println("Ingrese un ID del edificio que no este tomado");
                                            idUnico = r.nextInt();
                                        }
                                    }

                                }
                                System.out.println("Ingrese el nombre del edificio");
                                String nombreEdificio = r.nextLine();
                                nombreEdificio += r.nextLine();
                                Residencial residencial = null;
                                int posicionResidencial = 0;
                                String nombreResidencial = "";
                                while (residencial == null) {
                                    System.out.println("Ingrese el nombre de la residencial a la cual pertenece el edificio");
                                    nombreResidencial = r.nextLine();
                                    nombreResidencial += r.nextLine();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        String residencialAgregar = "";

                                        residencialAgregar = ((Residencial) residenciales.get(x)).getNombreResidencial();

                                        if (nombreResidencial.equals(residencialAgregar)) {
                                            residencial = residenciales.get(x);
                                            posicionResidencial = x;

                                        } else {

                                        }

                                    }

                                }

                                ArrayList<Apartamento> apartamentos = new ArrayList();
                                residenciales.get(posicionResidencial).getBienesInmuebles().add(new Edificio(0, nombreEdificio, apartamentos, direccion, dimensiones, idUnico, residencial));
                                break;
                            }
                            case 12: {
                                System.out.println("Ingrese el ID único del edificio para modificarlo");
                                int ID2 = r.nextInt();
                                int item2 = 0;
                                int posResidencial = 0;
                                for (int x = 0; x < residenciales.size(); x++) {

                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        int ID = 0;
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Edificio) {
                                            ID = ((Casa) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                        }
                                        if (ID2 == ID) {
                                            item2 = i;
                                            posResidencial = x;
                                            i = residenciales.get(x).getBienesInmuebles().size();
                                            x = residenciales.size();
                                        } else {
                                            item2 = 10000;
                                        }
                                    }
                                }
                                if (item2 != 10000) {
                                    System.out.println("Ingrese la nueva dirección del Edificio");
                                    ((Edificio) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDireccion(r.nextLine());
                                    System.out.println("Ingrese las nueva dimensiones del apartemento");
                                    ((Edificio) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setDimensionesTerreno(r.nextLine());
                                    System.out.println("Ingrese el nuevo ID único del apartemento");
                                    int idUnico = r.nextInt();
                                    for (int x = 0; x < residenciales.size(); x++) {
                                        int verificicarID = 0;
                                        for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i) instanceof BienesInmuebles) {
                                                verificicarID = ((BienesInmuebles) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                                            }

                                            while (idUnico == verificicarID) {
                                                System.out.println("Ingrese un ID del edificio que no este tomado");
                                                idUnico = r.nextInt();
                                            }
                                        }

                                    }
                                    ((Edificio) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setID(idUnico);
                                    System.out.println("Ingrese el nuevo nombre del edificio");
                                    ((Edificio) residenciales.get(posResidencial).getBienesInmuebles().get(item2)).setNombre(r.nextLine());

                                    break;

                                } else {
                                    System.out.println("No se encontro el apartemento que ingresó");

                                }
                                break;

                            }
                            case 13: {
                                for (int n = 0; n < residenciales.size(); n++) {

                                    for (int i = 0; i < residenciales.get(n).getBienesInmuebles().size(); i++) {

                                        if (residenciales.get(i).getBienesInmuebles().get(i) instanceof Edificio) {
                                            System.out.println(residenciales.get(i).getBienesInmuebles().get(i));
                                        }

                                    }

                                }
                                break;
                            }
                            case 14: {
                                System.out.println("Ingrese el ID único del edificio que desea eliminar");
                                int idUnico = r.nextInt();
                                for (int x = 0; x < residenciales.size(); x++) {
                                    for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                                        if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Edificio) {
                                            if (residenciales.get(x).getBienesInmuebles().get(i).getID() == idUnico) {
                                                residenciales.get(x).getBienesInmuebles().remove(i);
                                                i = residenciales.get(x).getBienesInmuebles().size();
                                                x = residenciales.size();
                                            } else {
                                                System.out.println("No se encontro el edificio que ingresó");

                                            }

                                        }

                                    }

                                }
                                break;
                            }

                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el ID único de la propiedad para comprarla");
                    int ID2 = r.nextInt();
                    int item2 = 0;
                    int posResidencial = 0;
                    for (int x = 0; x < residenciales.size(); x++) {

                        for (int i = 0; i < residenciales.get(x).getBienesInmuebles().size(); i++) {
                            int ID = 0;
                            if (residenciales.get(x).getBienesInmuebles().get(i) instanceof Edificio) {
                                ID = ((Casa) residenciales.get(x).getBienesInmuebles().get(i)).getID();
                            }
                            if (ID2 == ID) {
                                item2 = i;
                                posResidencial = x;
                                i = residenciales.get(x).getBienesInmuebles().size();
                                x = residenciales.size();
                            } else {
                                item2 = 10000;
                            }
                        }
                    }
                    if (item2 != 10000) {
                        System.out.println("Ingrese su nombre de usuario");
                        String usuario = r.next();
                        System.out.println("Ingrese su contraseña");
                        String contraseña = r.next();

                        for (int x = 0; x < clientes.size(); x++) {
                            String usuarioVerificar = "";
                            String contraseñaVerificar = "";
                            usuarioVerificar = ((Cliente) clientes.get(x)).getUsuario();
                            contraseñaVerificar = ((Cliente) clientes.get(x)).getContraseña();
                            if (usuario.equals(usuarioVerificar) && contraseña.equals(contraseñaVerificar)) {
                                System.out.println("Ha comprado la propiedad:");
                                System.out.println(residenciales.get(posResidencial).getBienesInmuebles().get(item2));
                                System.out.println("Que tenga un buen día.");
                                clientes.get(x).getBienesRaices().add(residenciales.get(posResidencial).getBienesInmuebles().get(item2));

                            } else {
                                System.out.println("El usuario no fue encontrado");
                            }

                        }

                    } else {
                        System.out.println("No se encontro el ID de la propiedad que acaba de ingresar");
                    }
                    break;
                }

            }
        }
    }
}
