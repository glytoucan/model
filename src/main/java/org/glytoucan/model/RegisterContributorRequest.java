package org.glytoucan.model;

public class RegisterContributorRequest {

	String name;
	String email;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
