package com.example.parking_monitor;

import java.time.LocalDateTime;


public class ParkingEvent {

 private ParkingSlot slot;
 private EventType eventType;
 private LocalDateTime timestamp;

 ParkingEvent(ParkingSlot slot, EventType eventType) {
		this.slot = slot;
		this.eventType = eventType;
		this.timestamp = LocalDateTime.now();
	}

 public ParkingSlot getSlot() {
	return slot;
 }

 public EventType getEventType() {
	
	return eventType;
 }

 public LocalDateTime getTimestamp() {
	
	
	return timestamp;
 }

}
