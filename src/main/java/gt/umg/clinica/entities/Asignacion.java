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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Steven
 */
@Entity()
@Table(name = "ASIGNACION", schema = "CLINICA")
public class Asignacion implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "asignacion_seq")
    @SequenceGenerator(name = "asignacion_seq", sequenceName = "asignacion_seq", initialValue= 1, allocationSize = 1)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "ID_TRABAJADOR", referencedColumnName = "ID")
    private Trabajador trabajador;

    @Column(name = "ID_CITA")
    private Integer idCita;

    public Asignacion() {
    }

    public Asignacion(Integer id, Date fecha, Paciente paciente, Trabajador trabajador, Integer idCita) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.trabajador = trabajador;
        this.idCita = idCita;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

}
