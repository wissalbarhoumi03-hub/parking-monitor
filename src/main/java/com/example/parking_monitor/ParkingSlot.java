package com.example.parking_monitor;


public class ParkingSlot {

    private String id;
    private boolean occupied;

    public ParkingSlot(String id) {
        this.id = id;
        this.occupied = false;
    }

    public boolean isOccupied() {
        return occupied;
    }

	public String getId() {
		
		return id;
	}

	public void occupy() {
		this.occupied = true;
		
	}

	public void free() {
		this.occupied = false;
		
	}

}
