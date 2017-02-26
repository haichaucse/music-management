package com.chaunguyen.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1285135688203770347L;
	
	private String name;
	private Set<Item> items = new HashSet<Item>();
	
	public Category(String name) {
		this.name = name;
	}
	
	protected Category() {
		//required by JPA
	}
	
	private Integer id;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy="category", cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.LAZY)
	//@JsonManagedReference
	public Set<Item> getItems() {
		return items;
	}
	
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		item.setCategory(this);
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}

}
