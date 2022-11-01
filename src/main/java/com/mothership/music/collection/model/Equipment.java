package com.mothership.music.collection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    Double price;

    public Equipment(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
