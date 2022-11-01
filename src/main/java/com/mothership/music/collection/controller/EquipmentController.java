package com.mothership.music.collection.controller;

import com.mothership.music.collection.model.Equipment;
import com.mothership.music.collection.repository.EquipmentRepository;
import com.mothership.music.collection.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @GetMapping("/all")
    public List<Equipment> showTableData(){
        return this.equipmentService.showAllEquipment();
    }
    @GetMapping("/addEquipData")
    public void addEquipmentData(){
        this.equipmentService.addRandomEquipment();
    }

}
