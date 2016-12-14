package org.glytoucan.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

/**
 * Class to hold information about Glycans
 */

@XmlRootElement (name="glycan")
@JsonSerialize

// to ignore null-possible mass value.
@JsonInclude(content=Include.NON_NULL)
public class Glycan {
	String accessionNumber;
    Date dateEntered;
	String structure;
	String mass;
	String contributor;
	
	@XmlAttribute
	public String getAccessionNumber() {
		return accessionNumber;
	}

	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}

	@JsonSerialize(using = DateSerializer.class)
	@XmlAttribute
	public Date getDateEntered() {
		return dateEntered;
	}

	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}

	@XmlElement(name="structure")
	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	/**
	 * @return the mass
	 */
	@XmlAttribute
	public String getMass() {
		return mass;
	}

	/**
	 * @param mass the mass to set
	 */
	public void setMass(String mass) {
		this.mass = mass;
	}
	
	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
}
