package com.salesianostriana.dam.resteval;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/place/")
public class PlaceController {

    private PlaceRepository placeRepository;

    @GetMapping
    public List<Place> getAll(){
        List<Place>places = placeRepository.getAll();
        if (places.isEmpty())
            ResponseEntity.notFound();
        return placeRepository.getAll();
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
