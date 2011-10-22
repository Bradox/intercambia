package org.socialnetwork.db.beans;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PROJECT_IMAGE", 
	     	   joinColumns = { @JoinColumn(name = "PROJECT_ID") }, 
	 		   inverseJoinColumns = { @JoinColumn(name = "IMAGE_ID") })
	private List<Image> images;
	@Column(name="DETAIL", columnDefinition="TEXT")
	private String detail;
	@OneToMany(mappedBy="project")
	private List<Comment> comments;	
	
	
	public Project(Long id, List<Image> images, String detail,List<Comment> comments) {
		super();
		this.id = id;
		this.images = images;
		this.detail = detail;
		this.comments = comments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
}
