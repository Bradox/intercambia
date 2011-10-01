package org.socialnetwork.db.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROVINCE")
public class Province 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;
	@Column(name="name", nullable=false)
	private String name;
	@OneToMany (mappedBy="province")
	private List<Municipality> municipalities;
	
	public Province(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.municipalities=new ArrayList<Municipality>();
	}
	public Province(Long id, String name, List<Municipality> municipalities) {
		super();
		this.id = id;
		this.name = name;
		this.municipalities = municipalities;
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
	public List<Municipality> getMunicipalities() {
		return municipalities;
	}
	public void setMunicipalities(List<Municipality> municipalities) {
		this.municipalities = municipalities;
	}
	
	
}
