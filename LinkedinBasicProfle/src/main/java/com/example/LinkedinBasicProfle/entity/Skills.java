package com.example.LinkedinBasicProfle.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skills {
	
	@Column(nullable=false)
	private String skillName;
	
	@Id
	@GeneratedValue()
	private Long id;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
	@JsonBackReference
	private User user;
	
	public Skills() {}

	public Skills(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Skills [skillName=" + skillName + "]";
	}

	
}
