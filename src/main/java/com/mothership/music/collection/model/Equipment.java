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

	String manufacturer;

	Double price;

    Double weight;

	public Equipment(String name, String manufacturer, Double price, Double weight) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.weight = weight;
	}
}
