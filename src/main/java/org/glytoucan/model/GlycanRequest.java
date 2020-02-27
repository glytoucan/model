package org.glytoucan.model;

public class GlycanRequest {

	String sequence, format, publicDatabaseStructureId, accessionNumber;

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getPublicDatabaseStructureId() {
		return publicDatabaseStructureId;
	}

	public void setPublicDatabaseStructureId(String publicDatabaseStructureId) {
		this.publicDatabaseStructureId = publicDatabaseStructureId;
	}

  public String getAccessionNumber() {
    return accessionNumber;
  }

  public void setAccessionNumber(String accessionNumber) {
    this.accessionNumber = accessionNumber;
  }
}
