package org.socialnetwork.db.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
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
	 @OneToOne
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
	 @OneToOne(cascade = CascadeType.ALL)
	 private Comment comment;
	 @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "USER_MAILS_TO", 
	 			joinColumns = { @JoinColumn(name = "USER_TO_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "MAIL_TO_ID") })
	 private List<Mail> mailsTo;
	/* @OneToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "USER_MAIL_FROM", 
	 			joinColumns = { @JoinColumn(name = "USER_FROM_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "MAIL_FROM_ID") })
	 private List<Mail> mailsFrom;*/
	 
	 public User(Long id, String nickName, String name, String lastName,Municipality location, List<Project> projectsSupplied, List<Project> projectsOffered,String skills, String portafolio, String bio, Image picture, Comment comment) 
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

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public List<Mail> getMailsTo() {
		return mailsTo;
	}

	public void setMailsTo(List<Mail> mailsTo) {
		this.mailsTo = mailsTo;
	}
	/*public List<Mail> getMailsFrom() {
		return mailsFrom;
	}
	public void setMailsFrom(List<Mail> mailsFrom) {
		this.mailsFrom = mailsFrom;
	}*/

}
