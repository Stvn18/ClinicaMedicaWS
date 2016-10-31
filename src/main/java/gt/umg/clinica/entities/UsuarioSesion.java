/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author steven
 */
@Entity()
@Table(name = "USUARIO_SESION", schema = "CLINICA")
public class UsuarioSesion implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuarioS;

    @Column(name = "TOKEN")
    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn()
    private Usuario usuario;

    public UsuarioSesion() {
    }

    public UsuarioSesion(Integer idUsuarioS, String token, Date fechaInicio, Date fechaFin, Usuario usuario) {
        this.idUsuarioS = idUsuarioS;
        this.token = token;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuario = usuario;
    }

    public Integer getIdUsuarioS() {
        return idUsuarioS;
    }

    public void setIdUsuarioS(Integer idUsuarioS) {
        this.idUsuarioS = idUsuarioS;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}