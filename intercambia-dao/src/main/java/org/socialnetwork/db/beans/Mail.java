package org.socialnetwork.db.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MAIL")
public class Mail
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "ID", updatable = false, nullable = false)
	 private Long id;
	 @OneToMany(mappedBy="mailsTo")
	 private User userTo;
	// @OneToMany(mappedBy="mailsFrom")
	// private User userFrom;
	 @Column(name="SUBJECT")
	 private String subject;
	 @Column(name="BIO", columnDefinition="CONTENT")
	 private String content;
	
	 public Mail(Long id, User userTo, User userFrom, String subject,String content) {
		super();
		this.id = id;
		this.userTo = userTo;
		//this.userFrom = userFrom;
		this.subject = subject;
		this.content = content;
	 }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUserTo() {
		return userTo;
	}

	public void setUserTo(User userTo) {
		this.userTo = userTo;
	}

	/*public User getUserFrom() {
		return userFrom;
	}

	public void setUserFrom(User userFrom) {
		this.userFrom = userFrom;
	}*/

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	 
}
