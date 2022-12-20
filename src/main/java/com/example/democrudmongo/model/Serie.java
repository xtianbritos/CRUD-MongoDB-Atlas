package com.example.democrudmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "series")
@Data
public class Serie {

    @Id
    private String id;
    private String nombre;
    private String creador;
    private Integer estreno;
}
