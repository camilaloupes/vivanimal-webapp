package com.application.repository;

import com.application.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    // Custom query to find pets by breed and age

    List<Pet> findBySpecies(String species);
    List<Pet> findBySpeciesAndAge(String species, int age);
    List<Pet> findBySpeciesAndGender(String species, String gender);
    List<Pet> findBySpeciesAndSize(String species, String size);
    List<Pet> findBySpeciesAndAgeAndGender(String species, int age, String gender);
    List<Pet> findBySpeciesAndAgeAndSize(String species, int age, String size);
    List<Pet> findBySpeciesAndGenderAndSize(String species, String gender, String size);
    List<Pet> findBySpeciesAndAgeAndSizeAndGender(String species, int age, String size, String gender);

    List<Pet> findByAge(int age);
    List<Pet> findByAgeAndGender(int age, String gender);
    List<Pet> findByAgeAndSize(int age,String size);
    List<Pet> findByAgeAndSizeAndGender(int age, String size, String gender);
    List<Pet> findByGender(String gender);
    List<Pet> findByGenderAndSize(String gender, String size);
    List<Pet> findByGenderAndAge(String gender, int age);
    List<Pet> findByGenderAndAgeAndSize(String gender, int age, String size);

    List<Pet> findBySize(String size);
    List<Pet> findBySizeAndAge(String size, int age);
    List<Pet> findBySizeAndGender(String size, String gender);
    List<Pet> findBySizeAndAgeAndGender(String size, int age, String gender);

    List<Pet> findByAgeAndSizeAndGenderAndSpecies(int age, String size, String gender, String species);



}