/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author steven
 */

@Entity()
@Table(name="HABITACION", schema="CLINICA")
public class Habitacion implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHabitacion;
    
    @Column(name="NIVEL")
    private Integer nivel;
    
    @Column(name="CAMAS")
    private Integer camas;
    
    @Column(name="CATEGORIA", length = 25)
    private String categoria;
    
    @ManyToOne
    @JoinColumn()
    private Clinica clinica;

    public Habitacion() {
    }

    public Habitacion(Integer idHabitacion, Integer nivel, Integer camas, String categoria, Clinica clinica) {
        this.idHabitacion = idHabitacion;
        this.nivel = nivel;
        this.camas = camas;
        this.categoria = categoria;
        this.clinica = clinica;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
    
}
