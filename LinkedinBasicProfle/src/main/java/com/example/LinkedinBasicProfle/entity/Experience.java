package com.example.LinkedinBasicProfle.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name="Experience")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long experienceid;
	
	private String title;
	private String headline;
	private Date startDate;
	private Date endDate;
	private String employmentType;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="company_id")
	private Company company;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name="UserId",nullable=false)
	private User user;
	
	public Experience() {
		
	}

	public Experience(Long experienceid, String title, String headline, Date startDate, Date endDate,
			String employmentType, Company company) {
		super();
		this.experienceid = experienceid;
		this.title = title;
		this.headline = headline;
		this.startDate = startDate;
		this.endDate = endDate;
		this.employmentType = employmentType;
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Experience [experienceid=" + experienceid + ", title=" + title + ", headline=" + headline
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", employmentType=" + employmentType
				+ ", company=" + company + ", profile=" ;
	}

	public Long getExperienceid() {
		return experienceid;
	}

	public void setExperienceid(Long experienceid) {
		this.experienceid = experienceid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	
	
	
}
