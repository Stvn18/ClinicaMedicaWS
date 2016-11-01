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
@Table(name = "CLINICA", schema = "CLINICA")
public class Clinica implements java.io.Serializable {

    @Id()
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClinica;

    @Column(name = "NOMBRE", length = 25)
    private String nombreClinica;

    @Column(name = "NIT", length = 15)
    private String nitClinica;

    @Column(name = "DIRECCION", length = 25)
    private String direccionClinica;

    @Column(name = "TELEFONO", length = 8)
    private String telefonoClinica;
    

    public Clinica() {
    }

    public Clinica(Integer idClinica, String nombreClinica, String nitClinica, String direccionClinica, String telefonoClinica) {
        this.idClinica = idClinica;
        this.nombreClinica = nombreClinica;
        this.nitClinica = nitClinica;
        this.direccionClinica = direccionClinica;
        this.telefonoClinica = telefonoClinica;
    }

    public Integer getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(Integer idClinica) {
        this.idClinica = idClinica;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getNitClinica() {
        return nitClinica;
    }

    public void setNitClinica(String nitClinica) {
        this.nitClinica = nitClinica;
    }

    public String getDireccionClinica() {
        return direccionClinica;
    }

    public void setDireccionClinica(String direccionClinica) {
        this.direccionClinica = direccionClinica;
    }

    public String getTelefonoClinica() {
        return telefonoClinica;
    }

    public void setTelefonoClinica(String telefonoClinica) {
        this.telefonoClinica = telefonoClinica;
    }

}
