package com.example.server.Controller;

import com.example.server.entity.Locations;
import com.example.server.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationsController {
    @Autowired
    LocationsRepository locationsRepository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllLocations(){
        List<Locations> locations = locationsRepository.findAll();
        return ResponseEntity.ok(locations);
    }
}
