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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Steven
 */

@Entity()
@Table(name="CITA", schema= "CLINICA")
public class Cita implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCita;
    
    @Column(name="DESCRIPCION")
    private String descripcionCita;
    
    @Column(name="ESTADO")
    private Integer estadoCita;
    
    @OneToMany(mappedBy = "cita")
    private List <Asignacion> asignacion = new ArrayList<>();
    
    @OneToMany(mappedBy = "cita")
    private List <Historial> historial = new ArrayList<>();
  
    @ManyToOne
    @JoinColumn()
    private Horario horario;

    public Cita() {
    }

    public Cita(Integer idCita, String descripcionCita, Integer estadoCita, Horario horario) {
        this.idCita = idCita;
        this.descripcionCita = descripcionCita;
        this.estadoCita = estadoCita;
        this.horario = horario;
    }

    public List<Asignacion> getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(List<Asignacion> asignacion) {
        this.asignacion = asignacion;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
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
