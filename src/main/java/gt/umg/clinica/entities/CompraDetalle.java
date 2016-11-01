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
 * @author steven
 */

@Entity()
@Table(name="COMPRA_DETALLE", schema="CLINICA")
public class CompraDetalle {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="DESCRIPCION", length = 25)
    private String descripcion;
    
    @Column(name="COSTOU")
    private Float costoU;
    
    @Column(name="IVA")
    private Float iva;
    
    @Column(name="CANTIDAD")
    private Integer cantidad;
    
    @Column(name="TOTAL")
    private Float total;
    
    @ManyToOne
    @JoinColumn()
    private Compra compra;
    
    @OneToMany(mappedBy = "compraDetalle")
    private List<Medicamento> medicamento = new ArrayList<>();

    public CompraDetalle() {
    }

    public CompraDetalle(Integer id, String descripcion, Float costoU, Float iva, Integer cantidad, Float total, Compra compra) {
        this.id = id;
        this.descripcion = descripcion;
        this.costoU = costoU;
        this.iva = iva;
        this.cantidad = cantidad;
        this.total = total;
        this.compra = compra;
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

    public Float getCostoU() {
        return costoU;
    }

    public void setCostoU(Float costoU) {
        this.costoU = costoU;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(List<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }
    
    
    
}
