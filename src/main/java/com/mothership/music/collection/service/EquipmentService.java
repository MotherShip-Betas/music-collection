package com.mothership.music.collection.service;

import com.mothership.music.collection.model.Equipment;
import com.mothership.music.collection.repository.EquipmentRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EquipmentService {

    final EquipmentRepository equipmentRepo;

	public EquipmentService(EquipmentRepository equipmentRepo) {
		this.equipmentRepo = equipmentRepo;
	}

	public List<Equipment> getAll(Map<String, String> allParams)
	{
		/*
		Double priceParam = allParams.get("price") == null ? null : Double.parseDouble(allParams.get("price"));
		Double weightParam = allParams.get("weight") == null ? null : Double.parseDouble(allParams.get("weight"));

		Example<Equipment> equipmentExample = Example.of(
				new Equipment(
						allParams.get("name"),
						allParams.get("manufacturer"),
						priceParam,
						weightParam
				));

		 */

		if(allParams.containsKey("name"))
			return this.equipmentRepo.FilterAllEquipmentByName(allParams.get("name"));
		if(allParams.containsKey("manufacturer"))
			return this.equipmentRepo.FilterAllEquipmentByManufacturer(allParams.get("manufacturer"));

		return this.equipmentRepo.findAll();
    }
    public void seedEquipment()
	{
        this.equipmentRepo.saveAll(List.of(
                new Equipment("Kontrol S4 Mk2", "Bull",  600.00, 21.00),
                new Equipment("Kontrol F1", "Bull",  600.00, 21.00),
                new Equipment("Kontrol F1", "Bull",  600.00, 21.00),
                new Equipment("Stanton T.62", "Bull",  600.00, 21.00),
                new Equipment("Stanton T.62", "Bull",  600.00, 21.00),
                new Equipment("Maschine Mk3", "Bull",  600.00, 21.00),
                new Equipment("ATH-M60X", "Bull",  600.00, 21.00)
        ));
    }

    public void deleteAll()
	{
        this.equipmentRepo.deleteAll();
    }

    public void deleteByID(int id)
	{
        this.equipmentRepo.deleteById(id);
    }

    public Equipment getByID(int id)
	{

        return this.equipmentRepo.findById(id).get();
    }
}
