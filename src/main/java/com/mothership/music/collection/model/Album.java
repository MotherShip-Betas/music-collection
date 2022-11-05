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
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    Date release_date;
//    File artwork;
    String artwork_file_name;
    // Spring gets mad at the List
//    List<Song> track_list;
    Integer track_count;
    Double run_time;

    //dumb constructor for quick seeding
    public Album(String title){
        this.title=title;
    }

    //actual constructor
//    public Album(String title, Date release_date, String artwork_file_name, List<Song> track_list){
//        this.title = title;
//        this.release_date = release_date;
//        this.artwork_file_name = artwork_file_name;
//        this.track_list = track_list;
//        track_count = track_list.size();
//        run_time = 0.0;
//        for(Song song : track_list){
//            run_time += song.getDuration();
//        }
//    }
}
