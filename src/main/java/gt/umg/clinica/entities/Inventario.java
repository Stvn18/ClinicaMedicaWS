/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author steven
 */

@Entity()
@Table(name="INVENTARIO", schema="CLINICA")
public class Inventario implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date fechaApertura;
    
    @Column(name="CMEDICINA")
    private Integer medicinas;
    
    @Column(name="CDINERO")
    private Integer dinero;

    public Inventario() {
    }

    public Inventario(Integer id, Date fechaApertura, Integer medicinas, Integer dinero) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.medicinas = medicinas;
        this.dinero = dinero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Integer getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(Integer medicinas) {
        this.medicinas = medicinas;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
   
}
