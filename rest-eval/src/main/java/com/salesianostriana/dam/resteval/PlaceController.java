package com.salesianostriana.dam.resteval;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/place/")
@RequiredArgsConstructor
public class PlaceController {

    private PlaceService service;

    @GetMapping
    public ListGetPlaceDto getAll(){ // Devuelve una lista de Dto
        return ListGetPlaceDto.ListToDto(
                service.getAll()
        );
    }

    @GetMapping("{id}")
    public Place getById(@PathVariable Long id){
        return service.getById(id);
    }

    @PostMapping
    public ResponseEntity<Place> create(
            @RequestBody CreatePlaceDto dto
    ){
        return ResponseEntity.status(201).body(dto.toPlace());
    }



















    @GetMapping("/{id}")
    public Optional<Place> getById(@PathVariable long id){
        return placeRepository.get(id);
    }

    @PostMapping()
    public Place add(Place place){
        return placeRepository.add(place);
    }

    @PutMapping
    public void edit(@PathVariable long id, Place place){

    }

    @DeleteMapping
    public void delete(@PathVariable long id){

    }

}
