package com.example.LinkedinBasicProfle.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue()
    private Long id;


    @Column(nullable = false,unique = true)
    private String name;
    
    @Column(nullable = false)
    private String password;

	@Column(nullable=false)
	private String fName;

	@Column(nullable=false)
	private String lName;

	private String TagLine;


	private String BackgroundUrl;

	private String Url;


	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private List<Experience> experience;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Education> education;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private List<Skills> skills;


	public User(){}

	public User( String name, String password, String fName, String lName, String tagLine, String backgroundUrl, String url) {
		this.name = name;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.TagLine = tagLine;
		this.BackgroundUrl = backgroundUrl;
		this.Url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getTagLine() {
		return TagLine;
	}

	public void setTagLine(String tagLine) {
		TagLine = tagLine;
	}

	public String getBackgroundUrl() {
		return BackgroundUrl;
	}

	public void setBackgroundUrl(String backgroundUrl) {
		BackgroundUrl = backgroundUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public List<Experience> getExperience() {
		return experience;
	}

	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}

	public List<Education> getEducation() {
		return education;
	}

	public void setEducation(List<Education> education) {
		this.education = education;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
}
