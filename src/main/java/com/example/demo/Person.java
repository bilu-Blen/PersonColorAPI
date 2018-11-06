package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Person {

    @GeneratedValue
    @Id
    private long id;
    private String fullName;
    private String address;

    @JsonIgnoreProperties("people")
    @ManyToMany
    private Set<Color> favouriteColors;


    public Person() {
        this.favouriteColors = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Color> getFavouriteColors() {
        return favouriteColors;
    }

    public void setFavouriteColors(Set<Color> favouriteColors) {
        this.favouriteColors = favouriteColors;
    }
}
