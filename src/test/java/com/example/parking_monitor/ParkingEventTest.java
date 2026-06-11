package com.example.parking_monitor;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParkingEventTest {

    @Test
    public void testEventHasCorrectSlot() {
        ParkingSlot slot = new ParkingSlot("A1");
        ParkingEvent event = new ParkingEvent(slot, EventType.OCCUPIED);
        assertThat(event.getSlot()).isEqualTo(slot);
    }
    
    @Test
    public void testEventHasCorrectType() {
        ParkingSlot slot = new ParkingSlot("A1");
        ParkingEvent event = new ParkingEvent(slot, EventType.OCCUPIED);
        assertThat(event.getEventType()).isEqualTo(EventType.OCCUPIED);
    }
    
    @Test
    public void testEventHasTimestamp() {
        ParkingSlot slot = new ParkingSlot("A1");
        ParkingEvent event = new ParkingEvent(slot, EventType.OCCUPIED);
        assertThat(event.getTimestamp()).isNotNull();
    }

}