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
 * @author steven
 */
@Entity()
@Table(name="FACTURA_DETALLE", schema="CLINICA")
public class FacturaDetalle implements java.io.Serializable {
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="CANTIDAD")
    private Integer cantidad;
    
    @Column(name="CODIGO", length = 10)
    private String codigo;
    
    @Column(name="DESCRIPCION", length = 25)
    private String descripcion;
    
    @Column(name="SUBTOTAL")
    private Integer subtotal;
    
    @Column(name="TOTAL")
    private Integer total;
    
    @ManyToOne
    @JoinColumn
    private Factura factura;
    
    @ManyToOne
    @JoinColumn
    private Tpago tpago;
    
    @ManyToOne
    @JoinColumn
    private Medicamento medicamento;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Integer id, Integer cantidad, String codigo, String descripcion, Integer subtotal, Integer total, Factura factura, Tpago tpago, Medicamento medicamento) {
        this.id = id;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.subtotal = subtotal;
        this.total = total;
        this.factura = factura;
        this.tpago = tpago;
        this.medicamento = medicamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Tpago getTpago() {
        return tpago;
    }

    public void setTpago(Tpago tpago) {
        this.tpago = tpago;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
}
