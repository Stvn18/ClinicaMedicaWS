/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author steven
 */
@Entity()
@Table(name = "PANTALLA", schema = "CLINICA")
public class Pantalla implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    private Integer idPantalla;

    @Column(name = "PANTALLA")
    private String pantalla;

    @Column(name = "javascript")
    private String javascript;

    @ManyToOne()
    @JoinColumn()
    private Rol rolid;

    public Pantalla() {
    }

    public Pantalla(Integer idPantalla, String pantalla, String javascript, Rol rolid) {
        this.idPantalla = idPantalla;
        this.pantalla = pantalla;
        this.javascript = javascript;
        this.rolid = rolid;
    }

    public Integer getIdPantalla() {
        return idPantalla;
    }

    public void setIdPantalla(Integer idPantalla) {
        this.idPantalla = idPantalla;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String javascript) {
        this.javascript = javascript;
    }

    public Rol getRolid() {
        return rolid;
    }

    public void setRolid(Rol rolid) {
        this.rolid = rolid;
    }

}
