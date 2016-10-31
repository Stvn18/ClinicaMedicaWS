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
@Table(name="PUESTO", schema="CLINICA")
public class Puesto implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPuesto;
    
    @Column(name="NOMBRE", length = 25)
    private String nombrePuesto;
    
    @Column(name="SALARIO")
    private Integer salario;
    
    @Column(name="UBICACION")
    private String ubicacion;
    
    @OneToMany(mappedBy = "puesto")
    private List<Trabajador> trabajador = new ArrayList<>();

    public Puesto() {
    }

    public Puesto(Integer idPuesto, String nombrePuesto, Integer salario, String ubicacion) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
        this.salario = salario;
        this.ubicacion = ubicacion;
    }

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Trabajador> getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(List<Trabajador> trabajador) {
        this.trabajador = trabajador;
    }
    
}
