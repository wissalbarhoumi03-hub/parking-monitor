package com.example.parking_monitor;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InMemoryParkingRepositoryTest {

    @Test
    public void testSaveAddsEventToRepository() {
        InMemoryParkingRepository repository = 
            new InMemoryParkingRepository();
        ParkingSlot slot = new ParkingSlot("A1");
        ParkingEvent event = 
            new ParkingEvent(slot, EventType.OCCUPIED);

        repository.save(event);

        assertThat(repository.findAll())
            .containsExactly(event);
    }
    
    @Test
    public void testFindAllReturnsEmptyListInitially() {
        InMemoryParkingRepository repository = 
            new InMemoryParkingRepository();

        assertThat(repository.findAll()).isEmpty();
    }

}
