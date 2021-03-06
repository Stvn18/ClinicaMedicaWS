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
 * @author Steven
 */
@Entity()
@Table(name = "USUARIO", schema = "CLINICA")
public class Usuario implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOMBRE", length = 25)
    private String nombreUsuario;

    @Column(name = "USUARIO", length = 25)
    private String usuario;

    @Column(name = "PASSWORD", length = 100)
    private String password;

    @Column(name = "ESTADO")
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "ROLID", referencedColumnName = "ID")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "ID_TRABAJADOR", referencedColumnName = "ID")
    private Trabajador trabajador;

    @ManyToOne
    @JoinColumn(name = "ID_PACIENTE", referencedColumnName = "ID")
    private Paciente paciente;

    public Usuario() {
    }

    public Usuario(Integer id, String nombreUsuario, String usuario, String password, Integer estado, Rol rol, Trabajador trabajador, Paciente paciente) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.password = password;
        this.estado = estado;
        this.rol = rol;
        this.trabajador = trabajador;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
