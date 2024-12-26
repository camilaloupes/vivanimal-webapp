package com.application.controller;

import com.application.model.Pet;
import com.application.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private PetService petService;

    @Autowired
    public void setPetService(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<List<Pet>> getAllPets() {
        return new ResponseEntity<>(petService.getAllPets(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable Long id) {
        try {
            Pet pet = petService.getPetById(id);
            return new ResponseEntity<>(pet, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
        Pet newPet = petService.addPet(pet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pet> updatePet(@PathVariable Long id, @RequestBody Pet petDetails) {
        try {
            Pet updatedPet = petService.updatePet(id, petDetails);
            return new ResponseEntity<>(updatedPet, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePet(@PathVariable Long id) {
        try {
            petService.deletePet(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}/adopt")
    public ResponseEntity<Pet> markAsAdopted(@PathVariable Long id) {
        try {
            Pet adoptedPet = petService.markAsAdopted(id);
            return new ResponseEntity<>(adoptedPet, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExceptions(Exception e) {
        return new ResponseEntity<>("An error occurred: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/search/species")
    public ResponseEntity<List<Pet>> searchPetsBySpecies(
            @RequestParam(required = false) String species) {
        List<Pet> pets = petService.searchPetsBySpecies(species);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-age")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndAge(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) int age) {
        List<Pet> pets = petService.searchPetsBySpeciesAndAge(species, age);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-gender")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndGender(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsBySpeciesAndGender(species, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-size")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndSize(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsBySpeciesAndSize(species, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-age-gender")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndAgeAndGender(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) int age,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsBySpeciesAndAgeAndGender(species, age, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-age-size")
    public ResponseEntity<List<Pet>> searchByPetsSpeciesAndAgeAndSize(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) int age,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsBySpeciesAndAgeAndSize(species, age, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-gender-size")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndGenderAndSize(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsBySpeciesAndGenderAndSize(species, gender, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/species-age-size-gender")
    public ResponseEntity<List<Pet>> searchPetsBySpeciesAndAgeSizeAndGender(
            @RequestParam(required = false) String species,
            @RequestParam(required = false) int age,
            @RequestParam(required = false) String size,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsBySpeciesAndAgeAndSizeAndGender(species, age, size, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/age")
    public ResponseEntity<List<Pet>> searchPetsByAge(
            @RequestParam(required = false) int age) {
        List<Pet> pets = petService.searchPetsByAge(age);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/age-gender")
    public ResponseEntity<List<Pet>> searchPetsByAgeAndGender(
            @RequestParam(required = false) int age,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchByAgeAndGender(age, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/age-size")
    public ResponseEntity<List<Pet>> searchPetsByAgeAndSize(
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsByAgeAndSize(age, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/age-size-gender")
    public ResponseEntity<List<Pet>> searchPetsByAgeAndSizeAndGender(
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String size,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsByAgeAndSizeAndGender(age, size, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/gender")
    public ResponseEntity<List<Pet>> searchPetsByGender(
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsByGender(gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/gender-size")
    public ResponseEntity<List<Pet>> searchPetsByGenderAndSize(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsByGenderAndSize(gender, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);

    }

    @GetMapping("/search/gender-age")
    public ResponseEntity<List<Pet>> searchPetsByGenderAndAge(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) Integer age) {
        List<Pet> pets = petService.searchPetsByGenderAndAge(gender, age);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/gender-age-size")
    public ResponseEntity<List<Pet>> searchPetsByGenderAndAgeAndSize(
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsByGenderAndAgeAndSize(gender, age, size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/size")
    public ResponseEntity<List<Pet>> searchPetsBySize(
            @RequestParam(required = false) String size) {
        List<Pet> pets = petService.searchPetsBySize(size);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/size-age")
    public ResponseEntity<List<Pet>> searchPetsBySizeAndAge(
            @RequestParam(required = false) String size,
            @RequestParam(required = false) Integer age) {
        List<Pet> pets = petService.searchPetsBySizeAndAge(size, age);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/size-gender")
    public ResponseEntity<List<Pet>> searchPetsBySizeAndGender(
            @RequestParam(required = false) String size,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsBySizeAndGender(size, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @GetMapping("/search/size-age-gender")
    public ResponseEntity<List<Pet>> searchPetsBySizeAndAgeAndGender(
            @RequestParam(required = false) String size,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String gender) {
        List<Pet> pets = petService.searchPetsBySizeAndAgeAndGender(size, age, gender);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }



}

