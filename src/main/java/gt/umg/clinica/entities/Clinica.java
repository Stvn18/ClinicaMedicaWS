/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.clinica.entities;

/**
 *
 * @author steven
 */
@Entity()
@Table(name = "CLINICA", schema = "CLINICA")
public class Clinica {

    @Id()
    @Column(name = "ID")
    private Integer idClinica;
    
    @Column(name = "DESCRIPCION", lenght=25)
    private String Descripcion;
    
    @Column(name = "ESTADO", lenght=25)
    private String Estado;
    

}
