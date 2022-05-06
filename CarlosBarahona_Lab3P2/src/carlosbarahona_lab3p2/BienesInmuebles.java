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
public class BienesInmuebles {
    private String direccion;
    private String dimensionesTerreno;
    private int ID;
    private Residencial residencial;

    public BienesInmuebles(String direccion, String dimensionesTerreno, int ID, Residencial residencial) {
        this.direccion = direccion;
        this.dimensionesTerreno = dimensionesTerreno;
        this.ID = ID;
        this.residencial = residencial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimensionesTerreno() {
        return dimensionesTerreno;
    }

    public void setDimensionesTerreno(String dimensionesTerreno) {
        this.dimensionesTerreno = dimensionesTerreno;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Residencial getResidencial() {
        return residencial;
    }

    public void setResidencial(Residencial residencial) {
        this.residencial = residencial;
    }

    @Override
    public String toString() {
        return "BienesInmuebles{" + "direccion=" + direccion + ", dimensionesTerreno=" + dimensionesTerreno + ", ID=" + ID + ", residencial=" + residencial + '}';
    }
    
    
}
