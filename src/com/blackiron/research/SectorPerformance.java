package com.blackiron.research;

import java.util.HashMap;
import java.util.Map;

public class SectorPerformance {

	private String financials;
	private String energy;
	private String materials;
	private String consumerDiscretionary;
	private String consumerStaples;
	private String telecommunicationServices;
	private String realEstate;
	private String industrials;
	private String informationTechnology;
	private String utilities;
	private String healthCare;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getFinancials() {
		return financials;
	}
	public void setFinancials(String financials) {
		this.financials = financials;
	}
	public String getEnergy() {
		return energy;
	}
	public void setEnergy(String energy) {
		this.energy = energy;
	}
	public String getMaterials() {
		return materials;
	}
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	public String getConsumerDiscretionary() {
		return consumerDiscretionary;
	}
	public void setConsumerDiscretionary(String consumerDiscretionary) {
		this.consumerDiscretionary = consumerDiscretionary;
	}
	public String getConsumerStaples() {
		return consumerStaples;
	}
	public void setConsumerStaples(String consumerStaples) {
		this.consumerStaples = consumerStaples;
	}
	public String getTelecommunicationServices() {
		return telecommunicationServices;
	}
	public void setTelecommunicationServices(String telecommunicationServices) {
		this.telecommunicationServices = telecommunicationServices;
	}
	public String getRealEstate() {
		return realEstate;
	}
	public void setRealEstate(String realEstate) {
		this.realEstate = realEstate;
	}
	public String getIndustrials() {
		return industrials;
	}
	public void setIndustrials(String industrials) {
		this.industrials = industrials;
	}
	public String getInformationTechnology() {
		return informationTechnology;
	}
	public void setInformationTechnology(String informationTechnology) {
		this.informationTechnology = informationTechnology;
	}
	public String getUtilities() {
		return utilities;
	}
	public void setUtilities(String utilities) {
		this.utilities = utilities;
	}
	public String getHealthCare() {
		return healthCare;
	}
	public void setHealthCare(String healthCare) {
		this.healthCare = healthCare;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

}
