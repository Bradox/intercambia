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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private List<Comment> coments;
	@Column(name="DETAIL", columnDefinition="TEXT")
	private String detail;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "PROJECT_COMMENT", 
	 			joinColumns = { @JoinColumn(name = "PROJECT_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "COMMENT_ID") })
	private List<Comment> comments;
	
}
