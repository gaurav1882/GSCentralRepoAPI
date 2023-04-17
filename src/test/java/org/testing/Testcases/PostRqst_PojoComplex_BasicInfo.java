package org.testing.Testcases;

public class PostRqst_PojoComplex_BasicInfo {
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCoursetype() {
		return coursetype;
	}
	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}
	public PostReq_PojoComplex_Address getAddress() {
		return Address;
	}
	public void setAddress(PostReq_PojoComplex_Address address) {
		Address = address;
	}
	String firstname;
	String lastname;
	String id;
	String designation;
	String coursetype;
	PostReq_PojoComplex_Address Address;
	
	
	

}
