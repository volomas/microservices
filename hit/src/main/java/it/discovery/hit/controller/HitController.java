package it.discovery.hit.controller;

import it.discovery.hit.domain.Hit;
import it.discovery.hit.repository.HitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HitController {

    private final HitRepository hitRepository;

    @GetMapping("/{id}")
    public List<Hit> findHits(String id) {
        return hitRepository.findHits(id);
    }

    @PostMapping
    public void saveHit(@RequestBody Hit hit) {
        hitRepository.saveHit(hit);
    }
}