package com.example.demo.service;

import com.example.demo.model.Promo;
import com.example.demo.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePromo {

    @Autowired
    private PromoRepository promoRepository;

    public List<Promo> findAll() {
        return promoRepository.findAll();
    }

    public Optional<Promo> findById(String id) {
        return promoRepository.findById(id);
    }

    public Promo save(Promo promo) {
        return promoRepository.save(promo);
    }

    public void deleteById(String id) {
        promoRepository.deleteById(id);
    }
}

