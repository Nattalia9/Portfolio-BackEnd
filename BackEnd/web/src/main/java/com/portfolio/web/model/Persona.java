
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    private String instagram;
    private String linkedin;
    private String github;
    private String codepen;
    private String imgUsuario;
    private String banner;
    private String portfolioPdf;
    private String descripcion;  

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String instagram, String linkedin, String github, String codepen, String imgUsuario, String banner, String portfolioPdf, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.github = github;
        this.codepen = codepen;
        this.imgUsuario = imgUsuario;
        this.banner = banner;
        this.portfolioPdf = portfolioPdf;
        this.descripcion = descripcion;
    }
      
}
