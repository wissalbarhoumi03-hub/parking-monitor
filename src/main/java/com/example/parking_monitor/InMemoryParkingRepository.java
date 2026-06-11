package com.example.parking_monitor;

import java.util.ArrayList;
import java.util.List;

public class InMemoryParkingRepository implements ParkingRepository {

	private List<ParkingEvent> events = new ArrayList<>();

	@Override
	public void save(ParkingEvent event) {
		events.add(event);

	}

	@Override
	public List<ParkingEvent> findAll() {
		
		return events;
	}

}
