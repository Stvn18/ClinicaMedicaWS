/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Steven
 */
@Entity()
@Table(name = "ASIGNACION", schema = "CLINICA")
public class Asignacion implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAsignacion;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    @JoinColumn()
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn()
    private Trabajador trabajador;
    
    @ManyToOne
    @JoinColumn()
    private Cita cita;
    
    @OneToMany(mappedBy = "asignacion")
    private List <Historial> historial = new ArrayList<>();

    public Asignacion() {
    }

    public Asignacion(Integer idAsignacion, Date fecha, Paciente paciente, Trabajador trabajador, Cita cita) {
        this.idAsignacion = idAsignacion;
        this.fecha = fecha;
        this.paciente = paciente;
        this.trabajador = trabajador;
        this.cita = cita;
    }

    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }

 
}
