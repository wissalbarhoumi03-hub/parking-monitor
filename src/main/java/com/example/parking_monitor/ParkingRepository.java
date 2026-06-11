package com.example.parking_monitor;

import java.util.List;

public interface ParkingRepository {
	
	void save(ParkingEvent event);
	
	List<ParkingEvent> findAll();

}
