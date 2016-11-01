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
@Table(name="PROVEEDOR", schema="CLINICA")
public class Proveedor implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;
    
    @Column(name="NOMBRE",length = 25)
    private String nombre;
    
    @Column(name="TELEFONO", length = 8)
    private String telefono;
    
    @Column(name="NIT", length = 15)
    private String nit;
    
    @Column(name="DIRECCION", length = 25)
    private String direccion;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @JsonIgnore()
    private Farmacia farmacia;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor, String nombre, String telefono, String nit, String direccion, Farmacia farmacia) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.nit = nit;
        this.direccion = direccion;
        this.farmacia = farmacia;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
}
