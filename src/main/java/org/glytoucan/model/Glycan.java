package org.glytoucan.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;

/**
 * Class to hold information about Glycans
 */

@XmlRootElement (name="glycan")
@JsonSerialize
public class Glycan {
	String accessionNumber;
    Date dateEntered;
	String structure;
	Double mass;
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
	public Double getMass() {
		return mass;
	}

	/**
	 * @param mass the mass to set
	 */
	public void setMass(Double mass) {
		this.mass = mass;
	}
	
	public String getContributor() {
		return contributor;
	}

	public void setContributor(String contributor) {
		this.contributor = contributor;
	}
}
