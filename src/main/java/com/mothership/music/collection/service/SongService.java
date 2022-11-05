package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Song;
import com.mothership.music.collection.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class SongService {

    final SongRepository songRepo;

    public SongService(SongRepository songRepo){
        this.songRepo = songRepo;
    }

    public List<Song> getAll(){
        return this.songRepo.findAll();
    }

    public void seedSongs(){
        songRepo.saveAll(List.of(
                new Song("Apostle's Warning", 241.0, 90.0, "1m", "apostles warning.mp3", "ph_lyrics", false),
                new Song("Bring the Pain", 202.0, 102.0, "11m", "Bring the Pain.mp3", "ph_lyrics", false),
                new Song("The Heist", 213.0, 94.0, "8d", "The Heist.mp3", "ph_lyrics", false),
                new Song("Baknaffek", 213.0, 95.0, "4m", "Baknaffek.mp3", "ph_lyrics", false),
                new Song("Fades Em All", 303.0, 87.0, "7m", "Fades Em All.mp3", "ph_lyrics", false)
        ));
    }

    public void deleteAll() { songRepo.deleteAll(); }

    public void deleteById(int id) { songRepo.deleteById(id); }

    public Song getById(int id) { return songRepo.findById(id).get(); }
}
