package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Album;
import com.mothership.music.collection.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    final AlbumRepository albumRepo;

    public AlbumService(AlbumRepository albumRepo) {this.albumRepo = albumRepo;}

    public List<Album> getAll() {return albumRepo.findAll();}

    public void seedAlbums(){
        albumRepo.saveAll(List.of(
                new Album("Hell on Earth"),
                new Album("Tical"),
                new Album("The Big Picture"),
                new Album("Straight up Sewaside"),
                new Album("Last Chance, No Breaks")
        ));
    }

    public void deleteAll() { albumRepo.deleteAll(); }

    public void deleteById(int id) { albumRepo.deleteById(id); }

    public Album getById(int id) { return albumRepo.findById(id).get();}
}
