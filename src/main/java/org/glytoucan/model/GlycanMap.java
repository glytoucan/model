package org.glytoucan.model;

import java.util.HashMap;

public class GlycanMap {
	
	HashMap<String, Object> datamap;
	
	public GlycanMap() {
		datamap = new HashMap<String, Object>();
	}
	
	public String getValue(String key) {
		return (String)datamap.get(key);
	}

	public Object getValueObject(String key) {
		return datamap.get(key);
	}
	
	public void setValue(String key, String value) {
		datamap.put(key, value);
	}

	public void setValueObject(String key, Object value) {
		datamap.put(key, value);
	}
}
