package com.example.server.Controller;

import com.example.server.entity.Regions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.server.repository.RegionsRepository;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionsController {

    @Autowired
    RegionsRepository regionsRepository;

    @GetMapping("/all")
    public ResponseEntity<?> findAllRegions(){
        List<Regions> regioni = regionsRepository.findAll();
        return ResponseEntity.ok(regioni);
    }
}
