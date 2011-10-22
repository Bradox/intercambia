package org.socialnetwork.db.beans;

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
@Table(name = "MUNICIPALITY")
public class Municipality 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;
	@Column(name="name", nullable=false)
	private String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "PROVINCE_MUNICIPALITY", 
	 			joinColumns = { @JoinColumn(name = "PROVINCE_ID") }, 
	 			inverseJoinColumns = { @JoinColumn(name = "MUNICIPALITY_ID") })
	private Province province;
	
	public Municipality(Long id, String name, Province province) {
		super();
		this.id = id;
		this.name = name;
		this.province = province;
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

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
		
}
