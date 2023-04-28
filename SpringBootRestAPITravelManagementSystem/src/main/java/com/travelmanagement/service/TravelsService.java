package com.travelmanagement.service;

import java.util.List;

import com.travelmanagement.model.Travels;

public interface TravelsService
{
public Travels saveTravels(Travels trvl);
public Travels updateTravels(Travels trvl,Long id);
public void deleteTravels(Long id);
public Travels getOneTravels(Long id);
public List<Travels> getAllTravels();
}
