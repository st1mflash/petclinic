package com.akolesnikov.petclinic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/pet")
public class PetsController {
    @GetMapping("/{id}")
    public Map<String, String> findPet(@PathVariable String id) {
        Map<String, String> pet = new HashMap<>();
        pet.put("id", "1");
        pet.put("name", "sharick");
        pet.put("type", "dog");
        pet.put("date", "2020-01-01");
        pet.put("status", "HEALTH");

        return pet;
    }

    @GetMapping
    public List<Map<String, String>> findAllPets() {
        List<Map<String, String>> petList = new ArrayList<>();
        Map<String, String> dog = new HashMap<>();
        dog.put("id", "1");
        dog.put("name", "sharick");
        dog.put("type", "dog");
        dog.put("date", "2020-01-01");
        dog.put("status", "HEALTH");
        petList.add(dog);

        Map<String, String> cat = new HashMap<>();
        cat.put("id", "2");
        cat.put("name", "kitiket");
        cat.put("type", "cat");
        cat.put("date", "2020-02-01");
        cat.put("status", "HEALTH");
        petList.add(cat);

        return petList;
    }

    @PostMapping
    public Map<String, String> createPet(@RequestBody Map<String, String> pet) {
        return pet;
    }

    @PutMapping
    public Map<String, String> updatePet(@RequestBody Map<String, String> pet) {
        return pet;
    }

    @PatchMapping
    public Map<String, String> updatePetPartially(@RequestBody Map<String, String> pet) {
        return pet;
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deletePet(@RequestBody Map<String, String> petId) {
    }
}
