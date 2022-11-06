package com.mothership.music.collection.model;

import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    Double duration;
    Double beats_per_min;
    String music_key;
    String filename;
    //    LocalDateTime date_added_to_db;
    @Column(columnDefinition = "TEXT")
    String lyrics;
    Boolean is_instrumental;


    public Song(String title, Double duration, Double beats_per_min, String music_key, String filename, String lyrics, Boolean is_instrumental) {
        this.title = title;
        this.duration = duration;
        this.beats_per_min = beats_per_min;
        this.music_key = music_key;
        this.filename = filename;
        this.lyrics = lyrics;
        this.is_instrumental = is_instrumental;
    }
}