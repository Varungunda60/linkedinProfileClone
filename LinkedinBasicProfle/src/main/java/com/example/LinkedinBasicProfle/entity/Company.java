package com.example.LinkedinBasicProfle.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", industryType=" + industryType + "]";
	}

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String name;
	private String location;
	private String industryType;
	
	@OneToMany(mappedBy="company",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Experience> experiences;

	public Company(){
		
	}
	
	
	
	public Company(String name, String location, String industryType) {
		super();
		this.name = name;
		this.location = location;
		this.industryType = industryType;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
	
}
