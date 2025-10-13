/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.pe.edu.upeu.sysventas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "upeu_perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_perfil", nullable = false)
    private Long idPerfil;
    //@Size(max = 20)
    private String nombre;
    //@Size(max = 6)
    private String codigo;
}
