/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Steven
 */

@Entity()
@Table(name="USUARIO", schema="CLINICA")
public class Usuario implements java.io.Serializable {
    
    @Id()
    @Column(name="id")
    private Integer idUsuairo;
    
    @Column(name="nombre")
    private String nombreUsuario;
    
    @Column(name="usuario")
    private String usuario;
    
    @Column(name="pass")
    private String pass;
    
    @Column(name="estado")
    private Integer estado;
    
    @Column(name="token")
    private String token;

    public Usuario() {
    }

    public Usuario(Integer idUsuairo, String nombreUsuario, String usuario, String pass, Integer estado, String token) {
        this.idUsuairo = idUsuairo;
        this.nombreUsuario = nombreUsuario;
        this.usuario = usuario;
        this.pass = pass;
        this.estado = estado;
        this.token = token;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
}
