package com.mothership.music.collection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mothership.music.collection.model.Song;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
