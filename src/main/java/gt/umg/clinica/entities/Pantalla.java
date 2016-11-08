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
    private Integer id;

    @Column(name = "PANTALLA")
    private String pantalla;

    @Column(name = "URL_IMAGE")
    private String urlImage;
    
    @Column(name = "ID_ROL")
    private Integer idRol;
    
    @Column(name = "HREF")
    private String href;

    public Pantalla() {
    }

    public Pantalla(Integer id, String pantalla, String urlImage, Integer idRol, String href) {
        this.id = id;
        this.pantalla = pantalla;
        this.urlImage = urlImage;
        this.idRol = idRol;
        this.href = href;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
}
