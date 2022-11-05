package com.mothership.music.collection.controller;

import com.mothership.music.collection.model.Artist;
import com.mothership.music.collection.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("/artist")
    public List<Artist> getAllArtists(){return artistService.getAll();}

    @GetMapping("/artist/{id}")
    public Artist getById(@PathVariable("id") int id){return artistService.getById(id);}

    @PostMapping("/artist/seed")
    public void generateData(){artistService.seedArtists();}

    @DeleteMapping("/artist/all")
    public void deleteAllData(){artistService.deleteAll();}

    @DeleteMapping("/artist/{id}")
    public void deleteById(@PathVariable("id") int id){artistService.deleteById(id);}
}
