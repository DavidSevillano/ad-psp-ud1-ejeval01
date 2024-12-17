package com.salesianostriana.dam.resteval;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlaceService {

    private final PlaceRepository repository;

    public List<Place> getAll() {

        List<Place> result = repository.getAll();
        if (result.isEmpty())
            throw new PlaceNotFoundException("No hay...");
        return result;
    }

    public Place getById(Long id){

        /*Optional<Place> result =
                repository.get(id);
        if(result.isPresent())
            return result.get();
        else
            throw new PlaceNotFoundException("No se ha podido encontrar con ese id %d".formatted(id));
            */

    }

}
