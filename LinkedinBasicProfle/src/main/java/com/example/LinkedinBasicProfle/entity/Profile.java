package com.example.LinkedinBasicProfle.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profileid",nullable = false)
	private Long id;
	
	@Column(name = "firstname",nullable=false)
	private String fName;
	
	@Column(name="lastname", nullable=false)
	private String lName;
	
	@Column(name = "tagline")
	private String TagLine;
	
	@Column(name = "bg_image_url")
	private String BackgroundUrl;
	
	@Column(name = "image_url")
	private String Url;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="login_id",nullable=false)
    private  User user;
	
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Experience> experience;
	
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Education> education;
	
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Skills> skills;
	
	
	
	public Profile() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	


	@Override
	public String toString() {
		return "Profile [id=" + id + ", fName=" + fName + ", lName=" + lName + ", TagLine=" + TagLine
				+ ", BackgroundUrl=" + BackgroundUrl + ", Url=" + Url + "]";
	}
	
	
	
}
