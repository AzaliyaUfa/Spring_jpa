package ru.ibs.internship.spring.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    private Long id;

    private String mnfName;

    private String modelName;
}
