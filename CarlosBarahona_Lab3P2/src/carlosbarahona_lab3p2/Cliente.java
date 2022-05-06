/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_lab3p2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Cliente {

    private String nombre;
    private int edad;
    private String ID;
    private String usuario;
    private String contraseña;
    private ArrayList<BienesInmuebles> bienesRaices;

    public Cliente(String nombre, int edad, String ID, String usuario, String contraseña, ArrayList<BienesInmuebles> bienesRaices) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.bienesRaices = bienesRaices;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<BienesInmuebles> getBienesRaices() {
        return bienesRaices;
    }

    public void setBienesRaices(ArrayList<BienesInmuebles> bienesRaices) {
        this.bienesRaices = bienesRaices;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", bienesRaices=" + bienesRaices + '}';
    }

}
