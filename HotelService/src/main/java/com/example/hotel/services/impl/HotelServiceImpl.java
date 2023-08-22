package com.example.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.entities.Hotel;
import com.example.hotel.exceptions.ResourceNotFoundException;
import com.example.hotel.repositories.HotelRepository;
import com.example.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository; 
	
	@Override
	public Hotel saveHotel(Hotel hotel) {
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No hotel exists for this id"));
	}

}
