package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Artist;
import com.mothership.music.collection.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    final ArtistRepository artistRepo;

    public ArtistService(ArtistRepository artistRepo) { this.artistRepo = artistRepo; }

    public List<Artist> getAll() { return this.artistRepo.findAll();}

    public void seedArtists(){
        artistRepo.saveAll(List.of(
                new Artist("Mobb Deep"),
                new Artist("Method Man"),
                new Artist("Big L"),
                new Artist("Das EFX"),
                new Artist("Jamal")
        ));
    }

    public void deleteAll(){this.artistRepo.deleteAll();}

    public void deleteById(int id){this.artistRepo.deleteById(id);}

    public Artist getById(int id){return this.artistRepo.findById(id).get();}
}
