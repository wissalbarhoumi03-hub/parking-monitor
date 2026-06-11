package com.example.parking_monitor;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;



public class ParkingServiceTest {

    private ParkingService service;
    private ParkingRepository repository;

    @BeforeEach
    public void setup() {
        repository = mock(ParkingRepository.class);
        service = new ParkingService(repository);
    }

    @Test
    public void testOccupySlotSavesEvent() {
        ParkingSlot slot = new ParkingSlot("A1");
        service.occupySlot(slot);
        verify(repository).save(any(ParkingEvent.class));
        assertThat(slot.isOccupied()).isTrue();
    }

    @Test
    public void testFreeSlotSavesEvent() {
        ParkingSlot slot = new ParkingSlot("A1");
        slot.occupy(); // first occupy the slot
        service.freeSlot(slot);
        verify(repository).save(any(ParkingEvent.class));
        assertThat(slot.isOccupied()).isFalse();
    }
    
    @Test
    public void testGetAllEventsReturnsEventsFromRepository() {
        ParkingSlot slot = new ParkingSlot("A1");
        ParkingEvent event = new ParkingEvent(slot, EventType.OCCUPIED);
        when(repository.findAll())
            .thenReturn(java.util.Arrays.asList(event));
        assertThat(service.getAllEvents())
            .containsExactly(event);
    }
}