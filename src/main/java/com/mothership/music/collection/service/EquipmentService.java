package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Equipment;
import com.mothership.music.collection.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepo;

    public List<Equipment> showAllEquipment(){
        return this.equipmentRepo.findAll();
    }
    public void addRandomEquipment(){
        this.equipmentRepo.saveAll(List.of(
                new com.mothership.music.collection.model.Equipment("Kontrol S4 Mk2", 600.00),
                new com.mothership.music.collection.model.Equipment("Kontrol F1", 200.00),
                new com.mothership.music.collection.model.Equipment("Kontrol F1", 200.00),
                new com.mothership.music.collection.model.Equipment("Stanton T.62", 250.00),
                new com.mothership.music.collection.model.Equipment("Stanton T.62", 250.00),
                new com.mothership.music.collection.model.Equipment("Maschine Mk3", 1000.00),
                new com.mothership.music.collection.model.Equipment("ATH-M60X", 219.00)
//                new com.mothership.music.collection.model.Equipment(""
        ));
    }

    public void deleteEquipment(){
        this.equipmentRepo.deleteAll();
    }

    public void deleteByID(int id){
        this.equipmentRepo.deleteById(id);
    }

    public Equipment getByID(int id) {
        return this.equipmentRepo.findById(id).get();
    }
}
