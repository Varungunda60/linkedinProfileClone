package com.example.LinkedinBasicProfle.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Education {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(nullable=false)
	private String schoolName;
	
	@Column(nullable=false)
	private String degree;
	
	@Column(nullable=false)
	private String feildOfStudy;

	@JsonFormat(pattern="yyyy-MM-dd")
	private Date StartDate;
	private Date EndDate;
	
	private Integer grade;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
    private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Education() {}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getDegree() {
		return degree;
	}

	@Override
	public String toString() {
		return "Education [schoolName=" + schoolName + ", degree=" + degree + ", feildOfStudy=" + feildOfStudy
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + ", grade=" + grade + "]";
	}

	public Education(String schoolName, String degree, String feildOfStudy, Date startDate, Date endDate,
			Integer grade) {
		super();
		this.schoolName = schoolName;
		this.degree = degree;
		this.feildOfStudy = feildOfStudy;
		StartDate = startDate;
		EndDate = endDate;
		this.grade = grade;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getFeildOfStudy() {
		return feildOfStudy;
	}

	public void setFeildOfStudy(String feildOfStudy) {
		this.feildOfStudy = feildOfStudy;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
}
