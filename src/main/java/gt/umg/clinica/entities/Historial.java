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
@Table(name="HISTORIAL", schema="CLINICA")
public class Historial implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistorial;
    
    @ManyToOne
    @JoinColumn()
    private Horario horario;
    
    @ManyToOne
    @JoinColumn()
    private Cita cita;
    
    @ManyToOne
    @JoinColumn()
    private Asignacion asignacion;

    public Historial() {
    }

    public Historial(Integer idHistorial, Horario horario, Cita cita, Asignacion asignacion) {
        this.idHistorial = idHistorial;
        this.horario = horario;
        this.cita = cita;
        this.asignacion = asignacion;
    }

    public Integer getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Integer idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Asignacion getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(Asignacion asignacion) {
        this.asignacion = asignacion;
    }
    
}
