package org.socialnetwork.db.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "USER")
public class User 
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "ID", updatable = false, nullable = false)
	 private Long id;
	 @Column(name="NICK_NAME", nullable=false)
	 private String nickName;
	 @Column(name="NAME", nullable=false)
	 private String name;
	 @Column(name="LASTNAME", nullable=false)
	 private String lastName;
	 @ManyToOne(cascade=CascadeType.ALL)
	 @JoinColumn(name="MUNICIPALITY_ID")
	 private Municipality location;
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "USER_PROJECT_SUPPLIED", 
	 			joinColumns = { @JoinColumn(name = "SUPPLIER_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "PROJECT_ID") })
	 private List<Project> projectsSupplied;
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "USER_PROJECT_OFFEROR", 
	 			joinColumns = { @JoinColumn(name = "OFFEROR_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "PROJECT_ID") })
	 private List<Project> projectsOffered;
	 private String skills;
	 private String portafolio;
	 @Column(name="BIO", columnDefinition="TEXT")
	 private String bio;
	 @OneToOne(cascade = CascadeType.ALL)
	 private Image picture;
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "USER_COMMENT", 
	 			joinColumns = { @JoinColumn(name = "USER_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "COMMENT_ID") })
	 private List<Comment> comment;
     @OneToMany (mappedBy="userTo")
     private List<Mail> MailsTo;
     @OneToMany(mappedBy="userFrom")
     private List<Mail> MailsFrom;
	 
     public User()
     {
    	 
     }
     
	 public User(Long id, String nickName, String name, String lastName,Municipality location, List<Project> projectsSupplied, List<Project> projectsOffered,String skills, String portafolio, String bio, Image picture, List<Comment> comment) 
	 {
		super();
		this.id = id;
		this.nickName = nickName;
		this.name = name;
		this.lastName = lastName;
		this.location = location;
		this.projectsSupplied = projectsSupplied;
		this.projectsOffered = projectsOffered;
		this.skills = skills;
		this.portafolio = portafolio;
		this.bio = bio;
		this.picture = picture;
		this.comment=comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Municipality getLocation() {
		return location;
	}

	public void setLocation(Municipality location) {
		this.location = location;
	}

	public List<Project> getProjectsOffered() {
		return projectsOffered;
	}

	public void setProjectsOffered(List<Project> projectsOffered) {
		this.projectsOffered = projectsOffered;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(String portafolio) {
		this.portafolio = portafolio;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}

	public List<Project> getProjectsSupplied() {
		return projectsSupplied;
	}

	public void setProjectsSupplied(List<Project> projectsSupplied) {
		this.projectsSupplied = projectsSupplied;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
}
