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
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Steven
 */
@Entity()
@Table(name = "ASIGNACION", schema = "CLINICA")
public class Asignacion implements java.io.Serializable{
    
    @Id()
    @Column(name="id")
    private Integer idAsignacion;
    
    @Column(name="fecha")
    private Date fecha;
    
    @ManyToOne
    private Paciente paciente;
    
    @ManyToOne
    private Trabajador trabajador;
    
    @ManyToOne
    private Cita cita;
    
    @OneToMany
    private List <Horario> horarios = new ArrayList<>();

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

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
    
    
    
    
}
