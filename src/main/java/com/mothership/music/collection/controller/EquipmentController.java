package com.mothership.music.collection.controller;

import com.mothership.music.collection.model.Equipment;
import com.mothership.music.collection.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class EquipmentController {

    @Autowired
    EquipmentService equipmentService;

    @GetMapping("/equipment")
    public List<Equipment> getAllEquipment(@RequestParam Map<String,String> allParams)
	{
		try
		{
//			return allParams;
        	return this.equipmentService.getAll(allParams);
		}
		catch (Exception e)
		{
			throw e;
		}
    }

    @GetMapping("/equipment/{id}")
    public Equipment getByID(@PathVariable("id") int id) {
        try{
            return this.equipmentService.getByID(id);
        } catch (Exception e){
            throw e;
        }
    }

    @PostMapping("/equipment")
    public void addEquipmentData() {
        this.equipmentService.seedEquipment();
    }

    @DeleteMapping("/equipment")
    public void deleteEquipData()
	{
		this.equipmentService.deleteAll();
	}

    @DeleteMapping("/equipment/{id}")
    public void deleteByID(@PathVariable("id") int id) { this.equipmentService.deleteByID(id); }
}
