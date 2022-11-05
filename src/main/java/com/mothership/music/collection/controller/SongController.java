package com.mothership.music.collection.controller;

import com.mothership.music.collection.model.Song;
import com.mothership.music.collection.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping("/song")
    public List<Song> getAllSongs(){return songService.getAll();}

    @GetMapping("song/{id}")
    public Song getByID(@PathVariable("id") int id){return songService.getById(id);}

    @PostMapping("/song/seed")
    public void generateData(){songService.seedSongs(); }

    @DeleteMapping("/song/all")
    public void deleteAllData(){songService.deleteAll();}

    @DeleteMapping("/song/{id}")
    public void deleteById(@PathVariable("id") int id) {songService.deleteById(id);}
}
