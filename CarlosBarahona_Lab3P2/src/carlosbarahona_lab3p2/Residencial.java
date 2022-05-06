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
public class Residencial {
    private ArrayList<BienesInmuebles> bienesInmuebles;
    private String nombreResidencial;

    public Residencial(ArrayList<BienesInmuebles> bienesInmuebles, String nombreResidencial) {
        this.bienesInmuebles = bienesInmuebles;
        this.nombreResidencial = nombreResidencial;
    }

    public ArrayList<BienesInmuebles> getBienesInmuebles() {
        return bienesInmuebles;
    }

    public void setBienesInmuebles(ArrayList<BienesInmuebles> bienesInmuebles) {
        this.bienesInmuebles = bienesInmuebles;
    }

    public String getNombreResidencial() {
        return nombreResidencial;
    }

    public void setNombreResidencial(String nombreResidencial) {
        this.nombreResidencial = nombreResidencial;
    }

    @Override
    public String toString() {
        return "Residencial{" + "bienesInmuebles=" + bienesInmuebles + ", nombreResidencial=" + nombreResidencial + '}';
    }
    
    
    
    
}
