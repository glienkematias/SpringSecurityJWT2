package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Long id;
    private String nombre;

    @Column(name = "fechanac")
    private String fechanacimiento;

    private String celular;
    private String email;

}
