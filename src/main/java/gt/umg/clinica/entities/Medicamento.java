/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author steven
 */
@Entity()
@Table(name="MEDICAMENTO", schema="CLINICA")
public class Medicamento implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="CODIGO", length = 10)
    private String codigo;
    
    @Column(name="NOMBRE", length = 25)
    private String nombre;
    
    @Temporal(TemporalType.DATE)
    private Date fechaFabricacion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento; 
    
    @Column(name="MARCA", length = 15)
    private String marca;
    
    @OneToMany(mappedBy = "medicamento")
    @JsonIgnore()
    private List<FacturaDetalle> facturaDetalle = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn()
    @JsonIgnore()
    private CompraDetalle compraDetalle;

    public Medicamento() {
    }

    public Medicamento(Integer id, String codigo, String nombre, Date fechaFabricacion, Date fechaVencimiento, String marca, CompraDetalle compraDetalle) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaVencimiento = fechaVencimiento;
        this.marca = marca;
        this.compraDetalle = compraDetalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<FacturaDetalle> getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(List<FacturaDetalle> facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

    public CompraDetalle getCompraDetalle() {
        return compraDetalle;
    }

    public void setCompraDetalle(CompraDetalle compraDetalle) {
        this.compraDetalle = compraDetalle;
    }
    
}
