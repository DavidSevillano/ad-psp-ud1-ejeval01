package com.salesianostriana.dam.resteval;

import java.util.List;

public record ListGetPlaceDto(
        long count,
        List<GetPlaceDto> items
) {

    public static ListGetPlaceDto ListToDto(List<Place> list){
        return new ListGetPlaceDto(
                list.size(),
                list.stream()
                        .map(GetPlaceDto::placeToDto)
                        //.map(p -> GetPlaceDto.placeToDto(p)) Otra forma de hacerse con una expresión lambda
                        .toList()
        );
    }


}
