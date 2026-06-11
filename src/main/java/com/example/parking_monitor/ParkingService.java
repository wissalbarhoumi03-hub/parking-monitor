package com.example.parking_monitor;

import java.util.List;

public class ParkingService {

	private ParkingRepository repository;

	public ParkingService(ParkingRepository repository) {
		this.repository = repository;
		
	}

	public void occupySlot(ParkingSlot slot) {
		slot.occupy();
		repository.save(new ParkingEvent(slot, EventType.OCCUPIED));
		
	}

	public void freeSlot(ParkingSlot slot) {
		slot.free();
		repository.save(new ParkingEvent(slot, EventType.FREE));
		
	}

	public List<ParkingEvent> getAllEvents() {
		
		return repository.findAll();
	}

}
