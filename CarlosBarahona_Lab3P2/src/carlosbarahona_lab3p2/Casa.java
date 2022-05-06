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
public class Casa extends BienesInmuebles {

    private int numCasa;
    private String nombreResidencial;

    public Casa(int numCasa, String nombreResidencial, String direccion, String dimensionesTerreno, int ID, Residencial residencial) {
        super(direccion, dimensionesTerreno, ID, residencial);
        this.numCasa = numCasa;
        this.nombreResidencial = nombreResidencial;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getNombreResidencial() {
        return nombreResidencial;
    }

    public void setNombreResidencial(String nombreResidencial) {
        this.nombreResidencial = nombreResidencial;
    }

    @Override
    public String toString() {
        return "Casa{" + "numCasa=" + numCasa + ", nombreResidencial=" + nombreResidencial + '}';
    }

}
