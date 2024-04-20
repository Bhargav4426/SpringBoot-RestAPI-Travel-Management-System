package com.travelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelmanagement.model.Travels;
import com.travelmanagement.service.TravelsService;

@RestController
@RequestMapping("/details")
@CrossOrigin(origins="http://localhost:3000/")
public class TravelsController 

{   @Autowired
	private TravelsService service;
    @PostMapping("/save")
	public Travels saveTravelDetails(@RequestBody Travels trvls)
    {
	  return service.saveTravels(trvls);
	  
    }
    @PutMapping("/update/{id}")
    public Travels updateTravelDetails(@RequestBody Travels trvls,@PathVariable Long id)
    {
    	return service.updateTravels(trvls, id);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteTravelsDetails(@PathVariable Long id)
    {
    	service.deleteTravels(id);
    }
    @GetMapping("/getone/{id}")
    public Travels getOneTravelDetails(@PathVariable Long id)
    {
    	return service.getOneTravels(id);
    }
    @GetMapping(" ")
    public List<Travels> getAllTravelDetails()
    {
    	return service.getAllTravels();
    }
    
}
