package com.travelmanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelmanagement.model.Travels;
@Repository
public interface TravelRepo extends JpaRepository<Travels, Long> {

}
