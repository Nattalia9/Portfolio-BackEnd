
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;
    private String img_url;
    private String repo_url;

    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, String img_url, String repo_url) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.img_url = img_url;
        this.repo_url = repo_url;
    }
     
}
