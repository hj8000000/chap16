package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CountryLanguage {

	private String countryCode;
	private String language;
	private String isOfficial;
	private double percentage;

	@Override
	public String toString() {

		ObjectMapper objectMapper = new ObjectMapper();
		
		String json = null;
		
		try {
			json = objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
	}
	
	public CountryLanguage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param value the countryCode to set
	 */
	public CountryLanguage setCountryCode(final String value) {
		countryCode = value;
		return this;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param value the language to set
	 */
	public CountryLanguage setLanguage(final String value) {
		language = value;
		return this;
	}

	/**
	 * @return the isOfficial
	 */
	public String getIsOfficial() {
		return isOfficial;
	}

	/**
	 * @param value the isOfficial to set
	 */
	public CountryLanguage setIsOfficial(final String value) {
		isOfficial = value;
		return this;
	}

	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}

	/**
	 * @param value the percentage to set
	 */
	public CountryLanguage setPercentage(final double value) {
		percentage = value;
		return this;
	}

}
