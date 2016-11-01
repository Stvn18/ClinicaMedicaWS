/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author steven
 */

@Entity()
@Table(name="FARMACIA", schema="CLINICA")
public class Farmacia implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFarmacia;
    
    @Column(name="NOMBRE", length = 25)
    private String nombreFarmacia;
    
    @Column(name="NIT", length = 15)
    private String nit;
    
    @Column(name="TELEFONO", length = 8)
    private String telefono;

    public Farmacia() {
    }

    public Farmacia(Integer idFarmacia, String nombreFarmacia, String nit, String telefono) {
        this.idFarmacia = idFarmacia;
        this.nombreFarmacia = nombreFarmacia;
        this.nit = nit;
        this.telefono = telefono;
    }

    public Integer getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(Integer idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public void setNombreFarmacia(String nombreFarmacia) {
        this.nombreFarmacia = nombreFarmacia;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
