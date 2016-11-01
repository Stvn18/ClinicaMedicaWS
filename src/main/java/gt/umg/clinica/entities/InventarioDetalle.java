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
@Table(name="INVENTARIO_DETALLE", schema="CLINICA")
public class InventarioDetalle implements java.io.Serializable{
    
    @Id()
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="CODIGO",length = 10)
    private String codigo;
    
    @Column(name="DESCRIPCION", length = 25)
    private String descripcion;
    
    @Column(name="PRECIO")
    private Integer precio;
    
    @ManyToOne
    @JoinColumn()
    private Inventario inventario;
    
    @ManyToOne
    @JoinColumn()
    private Medicamento medicamento;

    public InventarioDetalle() {
    }

    public InventarioDetalle(Integer id, String codigo, String descripcion, Integer precio, Inventario inventario, Medicamento medicamento) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.inventario = inventario;
        this.medicamento = medicamento;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

}
