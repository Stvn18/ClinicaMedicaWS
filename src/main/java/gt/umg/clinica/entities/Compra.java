/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

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
@Table(name="COMPRA", schema="CLINICA")
public class Compra implements java.io.Serializable {
    
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @Column(name="TOTAL")
    private Integer total;
    
    @Column(name="ESTADO", length = 1)
    private String estado;
    
    @ManyToOne
    @JoinColumn()
    private Proveedor proveedor;
    
    @OneToMany(mappedBy = "compra")
    private List <CompraDetalle> compraDetalle = new ArrayList<>();

    public Compra() {
    }

    public Compra(Integer id, Date fecha, Integer total, String estado, Proveedor proveedor) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.proveedor = proveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<CompraDetalle> getCompraDetalle() {
        return compraDetalle;
    }

    public void setCompraDetalle(List<CompraDetalle> compraDetalle) {
        this.compraDetalle = compraDetalle;
    }
    
}
