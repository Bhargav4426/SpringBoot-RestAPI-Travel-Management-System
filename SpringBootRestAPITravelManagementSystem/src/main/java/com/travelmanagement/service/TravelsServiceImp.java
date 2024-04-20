package com.travelmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.travelmanagement.model.Travels;
import com.travelmanagement.repo.TravelRepo;
@Service
@Profile(value={"dev","local","prod"})
public class TravelsServiceImp implements TravelsService
{
	@Autowired
private TravelRepo repo;
	@Override
	public Travels saveTravels(Travels trvl) {
		String guestOneName=trvl.getGuestOneName();
		String guestTwoName=trvl.getGuestTwoName();
		String guestThreeName=trvl.getGuestThreeName();
		int count=0;
			if(!guestOneName.isEmpty()) {
			    count++;
			}
			if(!guestTwoName.isEmpty()) {
			    count++;
			}
			if(!guestThreeName.isEmpty()) {
			    count++;
			}
		double total=0.00,discount=0.00,gst_amt=0.00,invoice_bill=0.00;
		total=trvl.getPrice()*count;
		if(total<50000)
		{
			discount=0.05*total;
			gst_amt=0.02*total;
			invoice_bill=(total+gst_amt)-discount;
			trvl.setTotal(total);
			trvl.setDiscount(discount);
			trvl.setGst_amt(gst_amt);
			trvl.setInvoice_bill(invoice_bill);
			trvl.setNoOfTravellers(count);
		}
		else if(total>=50000&&total<100000)
		{
			discount=0.10*total;
			gst_amt=0.03*total;
			invoice_bill=(total+gst_amt)-discount;
			trvl.setTotal(total);
			trvl.setDiscount(discount);
			trvl.setGst_amt(gst_amt);
			trvl.setInvoice_bill(invoice_bill);
			trvl.setNoOfTravellers(count);
		}
		else if(total>=100000)
		{
			discount=0.15*total;
			gst_amt=0.05*total;
			invoice_bill=(total+gst_amt)-discount;
			trvl.setTotal(total);
			trvl.setDiscount(discount);
			trvl.setGst_amt(gst_amt);
			trvl.setInvoice_bill(invoice_bill);
			trvl.setNoOfTravellers(count);
		}
		return repo.save(trvl);
	}

	@Override
	public Travels updateTravels(Travels trvl, Long id) {
		Travels oldTravel=repo.findById(id).get();
		oldTravel.setGuestOneName(trvl.getGuestOneName());
		oldTravel.setGuestOneDob(trvl.getGuestOneDob());
		oldTravel.setGuestTwoName(trvl.getGuestTwoName());
		oldTravel.setGuestTwoDob(trvl.getGuestTwoDob());
		oldTravel.setGuestThreeName(trvl.getGuestThreeName());
		oldTravel.setGuestThreeDob(trvl.getGuestThreeDob());
		oldTravel.setAddress(trvl.getAddress());
		oldTravel.setCity(trvl.getCity());
		oldTravel.setEmail(trvl.getEmail());
		oldTravel.setMobile(trvl.getMobile());
		oldTravel.setPackagename(trvl.getPackagename());
		oldTravel.setPrice(trvl.getPrice());
		return repo.save(oldTravel);
	}

	@Override
	public void deleteTravels(Long id) {
		repo.deleteById(id);

	}

	@Override
	public Travels getOneTravels(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Travels> getAllTravels() {
		return repo.findAll();
	}

}
