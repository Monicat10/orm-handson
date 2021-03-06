package com.cognizant.ormlearn.service;

import java.util.List;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.exp.CountryNotFoundException;

public interface CountryService {

	public List<Country> getAllCountries();

	public void addCountry(Country country);

	public void deleteCountry(String code);
	
	public void updateCountry(String code, String name);
	
	public List<Country> SortCountry(String name);
	
	public List<Country> SearchCountry(String name);

	public Country findCountryCode(String countryCode) throws CountryNotFoundException;

	


	
}
