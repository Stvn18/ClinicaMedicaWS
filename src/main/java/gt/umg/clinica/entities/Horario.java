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
@Table(name="HORARIO", schema="CLINICA")
public class Horario implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHorario;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;
    
    @OneToMany(mappedBy = "horario")
    private List<Cita> cita = new ArrayList<>();
    
    @OneToMany(mappedBy = "horario")
    private List<Historial> historial = new ArrayList<>();

    public Horario() {
    }

    public Horario(Integer idHorario, Date fecha, Date hora) {
        this.idHorario = idHorario;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public List<Cita> getCita() {
        return cita;
    }

    public void setCita(List<Cita> cita) {
        this.cita = cita;
    }

    public List<Historial> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Historial> historial) {
        this.historial = historial;
    }

}
