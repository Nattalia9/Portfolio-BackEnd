
package com.portfolio.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidad;
    private String progreso;
    private String nivel;
    private String icono;

    public Habilidad() {
    }

    public Habilidad(String habilidad, String progreso, String nivel, String icono) {
        this.habilidad = habilidad;
        this.progreso = progreso;
        this.nivel = nivel;
        this.icono = icono;
    }
       
}
