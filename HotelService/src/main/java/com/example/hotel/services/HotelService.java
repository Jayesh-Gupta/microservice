package com.example.hotel.services;

import java.util.List;

import com.example.hotel.entities.Hotel;

public interface HotelService {
	
	public Hotel saveHotel(Hotel hotel);
	
	public List<Hotel> getAllHotel();
	
	public Hotel getHotelById(String id);
	
	

}
