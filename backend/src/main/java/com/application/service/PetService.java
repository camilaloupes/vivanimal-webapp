package com.application.service;

import com.application.model.Pet;
import com.application.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private PetRepository petRepository;

    @Autowired
    public void setPetRepository(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }
    public Pet getPetById(Long id) {
        return petRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet not found with id: " + id));
    }

    public Pet updatePet(Long id, Pet petDetails) {
        Pet pet = getPetById(id);
        pet.setName(petDetails.getName());
        pet.setSpecies(petDetails.getSpecies());
        pet.setAge(petDetails.getAge());
        pet.setSize(petDetails.getSize());
        return petRepository.save(pet);
    }
    public void deletePet(Long id) {
        Pet pet = getPetById(id);
        petRepository.delete(pet);
    }



    public List<Pet> searchPetsBySpecies(String species) {
        return petRepository.findBySpecies(species);
    }
    public List<Pet> searchPetsBySpeciesAndAge(String species, int age) {
        return petRepository.findBySpeciesAndAge(species, age);
    }
    public List<Pet> searchPetsBySpeciesAndGender(String species, String gender) {
        return petRepository.findBySpeciesAndGender(species, gender);
    }
    public List<Pet> searchPetsBySpeciesAndSize(String species, String size) {
        return petRepository.findBySpeciesAndSize(species, size);
    }
    public List<Pet> searchPetsBySpeciesAndAgeAndGender(String species, int age, String gender) {
        return petRepository.findBySpeciesAndAgeAndGender(species, age, gender);
    }
    public List<Pet> searchPetsBySpeciesAndAgeAndSize(String species, int age, String size) {
        return petRepository.findBySpeciesAndAgeAndSize(species, age, size);
    }
    public List<Pet> searchPetsBySpeciesAndGenderAndSize(String species, String gender, String size) {
        return petRepository.findBySpeciesAndGenderAndSize(species, gender, size);
    }
    public List<Pet> searchPetsBySpeciesAndAgeAndSizeAndGender(String species, int age, String size, String gender) {
        return petRepository.findBySpeciesAndAgeAndSizeAndGender(species, age, size, gender);
    }
    public List<Pet> searchPetsByAge(int age) {
        return petRepository.findByAge(age);
    }
    public List<Pet> searchByAgeAndGender(int age, String gender) {
        return petRepository.findByAgeAndGender(age, gender);
    }
    public List<Pet> searchPetsByAgeAndSize(int age,String size) {
        return petRepository.findByAgeAndSize(age,size);
    }
    public List<Pet> searchPetsByAgeAndSizeAndGender(int age, String size, String gender) {
        return petRepository.findByAgeAndSizeAndGender(age, size, gender);
    }
    public List<Pet> searchPetsByGender(String gender) {
        return petRepository.findByGender(gender);
    }
    public List<Pet> searchPetsByGenderAndSize(String gender, String size) {
        return petRepository.findByGenderAndSize(gender, size);
    }
    public List<Pet> searchPetsByGenderAndAge(String gender, int age) {
        return petRepository.findByGenderAndAge(gender, age);
    }
    public List<Pet> searchPetsByGenderAndAgeAndSize(String gender, int age, String size) {
        return petRepository.findByGenderAndAgeAndSize(gender, age, size);
    }
    public List<Pet> searchPetsBySize(String size) {
        return petRepository.findBySize(size);
    }
    public List<Pet> searchPetsBySizeAndAge(String size, int age) {
        return petRepository.findBySizeAndAge(size, age);
    }
    public List<Pet> searchPetsBySizeAndGender(String size, String gender) {
        return petRepository.findBySizeAndGender(size, gender);
    }
    public List<Pet> searchPetsBySizeAndAgeAndGender(String size, int age, String gender) {
        return petRepository.findBySizeAndAgeAndGender(size, age, gender);
    }
    public List<Pet> searchPetsByAgeAndSizeAndGenderAndSpecies(int age, String size, String gender, String species) {
        return petRepository.findByAgeAndSizeAndGenderAndSpecies(age, size, gender, species);
    }

    public Pet markAsAdopted(Long id) {
        Pet pet = getPetById(id);
        pet.setStatus(true);
        return petRepository.save(pet);
    }
}

