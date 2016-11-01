/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author steven
 */
@Entity()
@Table(name="TRABAJADOR", schema="CLINICA")
public class Trabajador implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="NOMBRE", length = 25)
    private String nombre;
    
    @Column(name="APELLIDO", length = 25)
    private String apellido;
    
    @Column(name="EDAD")
    private Integer edad;
    
    @Column(name="TELEFONO", length = 8)
    private String telefono;
    
    @Column(name="SEXO", length = 1)
    private String sexo;
    
    @ManyToOne
    @JoinColumn
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn
    @JsonIgnore()
    private Puesto puesto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Clinica clinica;

    public Trabajador() {
    }

    public Trabajador(Integer id, String nombre, String apellido, Integer edad, String telefono, String sexo, Usuario usuario, Puesto puesto, Clinica clinica) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;
        this.usuario = usuario;
        this.puesto = puesto;
        this.clinica = clinica;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
    
}
