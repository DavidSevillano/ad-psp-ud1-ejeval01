package com.salesianostriana.dam.resteval;

public record PlaceDto(
        Long id,
        String name,
        String coords,
        String image
) {

    public static PlaceDto placeToDto(Place place){

        PlaceDto placeDto = new PlaceDto(
                place.getId(),
                place.getName(),
                place.getCoords(),
                place.getImage()
        );
        return placeDto;
    }
}
