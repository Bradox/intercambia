package org.socialnetwork.db.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
     @ManyToOne (cascade = CascadeType.ALL)
 	 @JoinTable(name = "PROJECT_COMMENT", 
		joinColumns = { @JoinColumn(name = "PROJECT_ID") }, 
		inverseJoinColumns = { @JoinColumn(name = "COMMENT_ID") })
	 private Project project;
	 
	 public Comment(Long id, String comment, String title, Project project) 
	 {
		super();
		this.id = id;
		this.comment = comment;
		this.title = title;
		this.project = project;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
