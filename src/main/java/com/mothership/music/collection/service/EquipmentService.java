package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Equipment;
import com.mothership.music.collection.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepo;

    public List<Equipment> showAllEquipment(){
        return this.equipmentRepo.findAll();
    }
    public void addRandomEquipment(){
        this.equipmentRepo.saveAll(List.of(
                new com.mothership.music.collection.model.Equipment("Desk", 45.00),
                new com.mothership.music.collection.model.Equipment("Monitor", 245.00),
                new com.mothership.music.collection.model.Equipment("Turn Tables", 423.82),
                new com.mothership.music.collection.model.Equipment("Headphones", 432.20),
                new com.mothership.music.collection.model.Equipment("Fleshlight", 25.00),
                new com.mothership.music.collection.model.Equipment("Audio Dack", 329.23),
                new com.mothership.music.collection.model.Equipment("Mixer", 545.87),
                new com.mothership.music.collection.model.Equipment("Launch Pad", 145.55)
        ));
    }
}
