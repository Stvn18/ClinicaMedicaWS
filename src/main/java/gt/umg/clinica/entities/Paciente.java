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
@Table(name="PACIENTE", schema="CLINICA")
public class Paciente implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;
    
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
    
    @Column(name="IGSS", length = 10)
    private String igss;
    
    @OneToMany(mappedBy = "paciente")
    private List <Factura> factura = new ArrayList<>();
    
    @OneToMany(mappedBy = "paciente")
    private List <Asignacion> asignacion = new ArrayList<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn()
    @JsonIgnore()
    private Clinica clinica;
    
    @OneToMany(mappedBy = "paciente")
    private Usuario usuario;

    public Paciente() {
    }

    public Paciente(Integer idPaciente, String nombre, String apellido, Integer edad, String telefono, String sexo, String igss, Clinica clinica, Usuario usuario) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.sexo = sexo;
        this.igss = igss;
        this.clinica = clinica;
        this.usuario = usuario;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getIgss() {
        return igss;
    }

    public void setIgss(String igss) {
        this.igss = igss;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }

    public List<Asignacion> getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(List<Asignacion> asignacion) {
        this.asignacion = asignacion;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
