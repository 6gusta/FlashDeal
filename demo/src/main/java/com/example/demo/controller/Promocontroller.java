package com.example.demo.controller;

import com.example.demo.model.Promo;
import com.example.demo.service.ServicePromo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/promos")
public class Promocontroller {

    @Autowired
    private ServicePromo servicePromo; 

    @GetMapping
    public List<Promo> getAllPromos() {
        return servicePromo.findAll(); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<Promo> getPromoById(@PathVariable String id) {
        Optional<Promo> promo = servicePromo.findById(id); 
        return promo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Promo createPromo(@RequestBody Promo promo) {
        return servicePromo.save(promo); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePromo(@PathVariable String id) {
        servicePromo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



