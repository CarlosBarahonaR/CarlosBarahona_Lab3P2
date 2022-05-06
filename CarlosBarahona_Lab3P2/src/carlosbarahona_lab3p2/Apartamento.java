/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosbarahona_lab3p2;

/**
 *
 * @author Admin
 */
public class Apartamento extends BienesInmuebles {

    private int numLocal;
    private String nombreEdificio;

    public Apartamento(int numLocal, String nombreEdificio, String direccion, String dimensionesTerreno, int ID, Residencial residencial) {
        super(direccion, dimensionesTerreno, ID, residencial);
        this.numLocal = numLocal;
        this.nombreEdificio = nombreEdificio;
    }

    public int getNumLocal() {
        return numLocal;
    }

    public void setNumLocal(int numLocal) {
        this.numLocal = numLocal;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "numLocal=" + numLocal + ", nombreEdificio=" + nombreEdificio + '}';
    }

}
