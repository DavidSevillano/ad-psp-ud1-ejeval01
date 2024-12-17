package com.salesianostriana.dam.resteval;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Place {

    private Long id;
    private String name;
    private String address;
    private String coords;
    private String desc;

    @Setter(AccessLevel.NONE) // No genera el setTags
    @Builder.Default // Si no añadimos nada al arraylist por defecto se crea vacio y no null
    private List<String> tags = new ArrayList<>();
    private String image;


    public void addTag(String tag) {

        if (tags.stream().noneMatch(t -> t.equalsIgnoreCase(tag))) // Si no encuentra uno igual lo añade
            tags.add(tag);

    }

    public void removeTag(String tag) {
        tags.removeIf(t -> t.equalsIgnoreCase(tag)); // Si encuentra uno igual lo elimina
    }





}
