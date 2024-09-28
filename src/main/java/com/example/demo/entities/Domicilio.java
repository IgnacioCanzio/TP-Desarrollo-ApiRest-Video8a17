package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder


public class Domicilio extends Base{

    private String calle;
    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Persona persona;



    @OneToMany(mappedBy = "domicilio")
    private Set<Localidad> localidades;

}