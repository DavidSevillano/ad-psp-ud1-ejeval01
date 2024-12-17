package com.salesianostriana.dam.resteval;

public record CreatePlaceDto(
        String name,
        String desc,
        String address,
        String coords,
        String image
) {

   /* public static Place toPlace(CreatePlaceDto dto){
        return Place.builder()
                .name(dto.name)
                .desc(dto.desc)
                .coords(dto.coords)
                .image(dto.image)
                .build();
    }
    */


    public Place toPlace(CreatePlaceDto dto){
        return Place.builder()
                .name(dto.name)
                .desc(dto.desc)
                .coords(dto.coords)
                .image(dto.image)
                .build();
    }

}
