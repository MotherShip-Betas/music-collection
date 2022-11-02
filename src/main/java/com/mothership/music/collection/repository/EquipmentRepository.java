package com.mothership.music.collection.repository;

import com.mothership.music.collection.model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

	//TODO: Dynamically add WHERE clause when params are not null
	@Query(value = "SELECT * FROM Equipment e WHERE e.name LIKE %?1%", nativeQuery = true)
	List<Equipment> FilterAllEquipmentByName(String name);

	@Query(value = "SELECT * FROM Equipment e WHERE e.manufacturer LIKE %?1%", nativeQuery = true)
	List<Equipment> FilterAllEquipmentByManufacturer(String manufacturer);
}
