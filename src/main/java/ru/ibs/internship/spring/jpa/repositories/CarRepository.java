package ru.ibs.internship.spring.jpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.internship.spring.jpa.entity.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    //Car findCarByMnfName(String mnfName);
}
