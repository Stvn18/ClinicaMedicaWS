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
@Table(name="TPAGO",schema="CLINICA")
public class Tpago implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTPago;
    
    @Column(name="DESCRIPCION", length = 25)
    private String descripcion;
    
    @Column(name="INTERES")
    private Integer interes;

    public Tpago() {
    }

    public Tpago(Integer idTPago, String descripcion, Integer interes) {
        this.idTPago = idTPago;
        this.descripcion = descripcion;
        this.interes = interes;
    }

    public Integer getIdTPago() {
        return idTPago;
    }

    public void setIdTPago(Integer idTPago) {
        this.idTPago = idTPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getInteres() {
        return interes;
    }

    public void setInteres(Integer interes) {
        this.interes = interes;
    }
    
}
