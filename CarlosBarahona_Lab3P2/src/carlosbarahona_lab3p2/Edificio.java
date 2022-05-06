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
public class Edificio extends BienesInmuebles {

    private int cantidadLocales;
    private String nombre;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(int cantidadLocales, String nombre, ArrayList<Apartamento> apartamentos, String direccion, String dimensionesTerreno, int ID, Residencial residencial) {
        super(direccion, dimensionesTerreno, ID, residencial);
        this.cantidadLocales = cantidadLocales;
        this.nombre = nombre;
        this.apartamentos = apartamentos;
    }

    public int getCantidadLocales() {
        return cantidadLocales;
    }

    public void setCantidadLocales(int cantidadLocales) {
        this.cantidadLocales = cantidadLocales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio{" + "cantidadLocales=" + cantidadLocales + ", nombre=" + nombre + ", apartamentos=" + apartamentos + '}';
    }

}
