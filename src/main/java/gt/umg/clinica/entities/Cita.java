/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Steven
 */

@Entity()
@Table(name="CITA", schema= "CLINICA")
public class Cita implements java.io.Serializable{
    
    @Id()
    @Column(name="id")
    private Integer idCita;
    
    @Column(name="descripcion")
    private String descripcionCita;
    
    @Column(name="estado")
    private Integer estadoCita;
    
    @ManyToOne
    private Horario horario;

    public Cita() {
    }

    public Cita(Integer idCita, String descripcionCita, Integer estadoCita, Horario horario) {
        this.idCita = idCita;
        this.descripcionCita = descripcionCita;
        this.estadoCita = estadoCita;
        this.horario = horario;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }

    public Integer getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(Integer estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
}
