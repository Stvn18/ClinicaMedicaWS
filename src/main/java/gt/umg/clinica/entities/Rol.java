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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author steven
 */
@Entity()
@Table(name="ROL", schema="CLINICA")
public class Rol implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="DESCRIPCION",length = 25)
    private String descripcion;
    
    @OneToMany(mappedBy = "rol")
    private List<Pantalla> pantalla = new ArrayList<>();
    
    @OneToMany(mappedBy = "rol")
    private List<Usuario> usuario = new ArrayList<>();

    public Rol(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Pantalla> getPantalla() {
        return pantalla;
    }

    public void setPantalla(List<Pantalla> pantalla) {
        this.pantalla = pantalla;
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    
}
