package com.news.egg.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Reputacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    
    public double calificacion;
    public String comentario;
    //public Profesional profesional;
    //public Consulta consulta;
    
}
