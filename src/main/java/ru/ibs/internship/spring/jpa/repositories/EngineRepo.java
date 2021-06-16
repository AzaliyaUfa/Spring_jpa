package ru.ibs.internship.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.internship.spring.jpa.entity.Car;

public interface EngineRepo extends JpaRepository<Car, Long> {
}
