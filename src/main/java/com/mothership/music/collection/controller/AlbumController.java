package com.mothership.music.collection.controller;

import com.mothership.music.collection.model.Album;
import com.mothership.music.collection.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("/album")
    public List<Album> getAllAlbums() { return albumService.getAll(); }

    @GetMapping("album/{id}")
    public Album getById(@PathVariable("id") int id) { return albumService.getById(id);}

    @PostMapping("/album/seed")
    public void generateData() { albumService.seedAlbums(); }

    @DeleteMapping("/album/all")
    public void deleteAllData() { albumService.deleteAll(); }

    @DeleteMapping("/album/{id}")
    public void deleteById(@PathVariable("id") int id) { albumService.deleteById(id); }
}
