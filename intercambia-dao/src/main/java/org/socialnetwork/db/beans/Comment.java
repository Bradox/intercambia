package org.socialnetwork.db.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMMENT")
public class Comment 
{

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "ID", updatable = false, nullable = false)
	 private Long id;
	 @Column(name="COMMENT", columnDefinition="TEXT", nullable=false)
	 private String comment;
	 @Column(name="TITLE")
	 private String title;
	 
	 public Comment(Long id, String comment, String title) 
	 {
		super();
		this.id = id;
		this.comment = comment;
		this.title = title;
	 }

	 public Long getId() {
		return id;
	 }

	 public void setId(Long id) {
		this.id = id;
	 }

	 public String getComment() {
		return comment;
	 }

	 public void setComment(String comment) {
		this.comment = comment;
	 }

	 public String getTitle() {
		return title;
	 }

	 public void setTitle(String title) {
		this.title = title;
	 }
}
