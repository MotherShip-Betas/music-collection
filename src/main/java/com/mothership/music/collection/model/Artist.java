package com.mothership.music.collection.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.File;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    File portrait;
    String portrait_file_name;

    public Artist(String name){
        this(name, "default_portrait.png");
    }

    public Artist(String name, String portrait_file_name) {
        this.name = name;
        this.portrait_file_name = portrait_file_name;
    }

}