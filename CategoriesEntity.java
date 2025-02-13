package com.indrayani.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoriesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "categories_categoryName")
	private String categoryName;
	@Column(name = "categories__description")
	private String description;
	@Column(name = "categories_parentCategory")
	private String parentCategory;
	@Column(name = "categories_orderNumber")
	private String orderNumber;
	@Column(name = "categories_isActive")
	private String isActive;
	@Column(name = "categories_created")
	private String created;
	@Column(name = "categories_updated")
	private String updated;
	
	@ManyToMany(mappedBy = "categories")
	List<ExamEntity> exams;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public List<ExamEntity> getExams() {
		return exams;
	}

	public void setExams(List<ExamEntity> exams) {
		this.exams = exams;
	}

		
}
