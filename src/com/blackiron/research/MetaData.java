package com.blackiron.research;

import java.util.HashMap;
import java.util.Map;

public class MetaData {
	private String information;
	private String lastRefreshed;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getLastRefreshed() {
		return lastRefreshed;
	}
	public void setLastRefreshed(String lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}
	public Map<String, Object> getAdditionalProperties() {
		return additionalProperties;
	}
	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}
}
