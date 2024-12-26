package com.application.model;

import jakarta.persistence.*;


@Entity
@Table(name = "animal")



public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private String size;
    private String description;
    private String picture;
    private boolean status=false;  // 'available' or 'adopted'

    public Pet(){}

    public Pet(int id,String name, String species, int age,String gender, String size,boolean status,String picture ,String description) {
        this.name = name;
        this.species = species;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.status = status;
        this.picture = picture;
        this.description =description;
    }


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return picture;
    }

    public void setImageUrl(String picture) {
        this.picture = picture;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = true;
    }

    public String getSize() {
        return size;

    }
    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", name='" + size + '\'' +

                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}