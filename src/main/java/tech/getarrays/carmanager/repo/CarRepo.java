package tech.getarrays.carmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.carmanager.model.Car;

public interface CarRepo extends JpaRepository<Car,Long> {
}
