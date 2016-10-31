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
@Table(name="USUARIO", schema="CLINICA")
public class Usuario implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuairo;
    
    @Column(name="NOMBRE", length = 25)
    private String nombreUsuario;
    
    @Column(name="USUARIO", length = 25)
    private String usuario;
    
    @Column(name="PASS", length = 25)
    private String pass;
    
    @Column(name="ESTADO")
    private Integer estado;
    
    @ManyToOne
    @JoinColumn()
    private Rol rol;
    
    @OneToMany(mappedBy = "usuario")
    private List<Trabajador> trabajador = new ArrayList<>();
    
    @OneToMany(mappedBy = "usuario")
    private List<Paciente> paciente = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(Integer idUsuairo, String nombreUsuario, String usuario, String pass, Integer estado, Rol rol) {
        this.idUsuairo = idUsuairo;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.pass = pass;
        this.estado = estado;
        this.rol = rol;
    }

    public Integer getIdUsuairo() {
        return idUsuairo;
    }

    public void setIdUsuairo(Integer idUsuairo) {
        this.idUsuairo = idUsuairo;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public List<Trabajador> getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(List<Trabajador> trabajador) {
        this.trabajador = trabajador;
    }

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }
     
}
