package com.okta.developer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.okta.developer.demo.model.Car;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {

}
