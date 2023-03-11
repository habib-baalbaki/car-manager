package tech.getarrays.carmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.carmanager.model.Car;
import tech.getarrays.carmanager.repo.CarRepo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CarService {

    private final CarRepo carRepo;

    @Autowired
    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Car addCar(Car car) {
        return carRepo.save(car);
    }

    public List<Car> findAllCars() {
        return carRepo.findAll();
    }

    public Car updateCar(Car car) {
        return carRepo.save(car);
    }

    public void deleteCar(Long id) {
        carRepo.deleteById(id);
    }

    public Optional<Car> findCarById(Long id) {
        return carRepo.findById(id);
    }


}
