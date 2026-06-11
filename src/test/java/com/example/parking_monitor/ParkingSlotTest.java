package com.example.parking_monitor;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParkingSlotTest {

    @Test
    public void testNewSlotIsAvailableByDefault() {
        ParkingSlot slot = new ParkingSlot("A1");
        assertThat(slot.isOccupied()).isFalse();
    }
    
    @Test
    public void testSlotHasCorrectId() {
        ParkingSlot slot = new ParkingSlot("A1");
        assertThat(slot.getId()).isEqualTo("A1");
    }

    @Test
    public void testSlotCanBeOccupied() {
        ParkingSlot slot = new ParkingSlot("A1");
        slot.occupy();
        assertThat(slot.isOccupied()).isTrue();
    }

    @Test
    public void testSlotCanBeFreed() {
        ParkingSlot slot = new ParkingSlot("A1");
        slot.occupy();
        slot.free();
        assertThat(slot.isOccupied()).isFalse();
    }

}
