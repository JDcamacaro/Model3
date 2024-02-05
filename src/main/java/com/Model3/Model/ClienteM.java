package com.Model3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class ClienteM {

    @Id
    @GeneratedValue

    private Long Id;
    private String Nombre;
    private String Apellido;
}
