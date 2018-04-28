package com.virtualprogrammers.fleetman.data;

import com.virtualprogrammers.fleetman.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleRepository extends JpaRepository<Vehicle, Long>{

    public Vehicle findByName(String name);
}
