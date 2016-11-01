/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "PANTALLA", schema = "CLINICA")
public class Pantalla implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPantalla;

    @Column(name = "PANTALLA")
    private String pantalla;

    @Column(name = "URL_IMAGE")
    private String urlImage;

    @ManyToOne()
    @JoinColumn()
    @JsonIgnore()
    private Rol rol;

    public Pantalla() {
    }

    public Pantalla(Integer idPantalla, String pantalla, String urlImage, Rol rol) {
        this.idPantalla = idPantalla;
        this.pantalla = pantalla;
        this.urlImage = urlImage;
        this.rol = rol;
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
