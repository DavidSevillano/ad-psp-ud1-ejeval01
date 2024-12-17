package com.salesianostriana.dam.resteval;

public record GetPlaceDto(
        Long id,
        String name,
        String coords,
        String image
) {

    public static GetPlaceDto placeToDto(Place place){

        return new GetPlaceDto(
                place.getId(),
                place.getName(),
                place.getCoords(),
                place.getImage()
        );
    }
}
