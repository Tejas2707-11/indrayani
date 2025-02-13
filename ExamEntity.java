package com.indrayani.entity;

import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "exam")
public class ExamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = "exam_examCode")
	private String examCode;
	@Column(name = "exam_examName")
	private String examName;
	@Column(name = "exam_examDesc")
	private String examDesc;
	@Column(name = "exam_examType")
	private String examType;
	@Column(name = "exam_price")
	private int price;
	@Column(name = "exam_examDuration")
	private int examDuration;
	@Column(name = "exam_totalMarks")
	private int totalMarks;
	@Column(name = "exam_passingMarks")
	private int passingMarks;
	@Column(name = "exam_passingPercent")
	private int passingPercent;
	@Column(name = "exam_rightAns")
	private int rightAns;
	@Column(name = "exam_wrongAns")
	private int wrongAns;
	@Column(name = "exam_skipAns")
	private int skipAns;
	@Column(name = "exam_totalQuestions")
	private int totalQuestions;
	@Column(name = "exam_difficultyLevel")
	private String difficultyLevel;
	@Column(name = "exam_createdBy")
	private int createdBy;
	@Column(name = "exam_isActive")
	private int isActive;

	@ManyToMany
	@JoinTable(name = "exam_category", // The join table
			joinColumns = @JoinColumn(name = "exam_id"), // Foreign key in exam_category referring to Exam
			inverseJoinColumns = @JoinColumn(name = "category_id") // Foreign key in exam_category referring to Category
	)
	List<CategoriesEntity> categories;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamDesc() {
		return examDesc;
	}

	public void setExamDesc(String examDesc) {
		this.examDesc = examDesc;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPassingMarks() {
		return passingMarks;
	}

	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
	}

	public int getPassingPercent() {
		return passingPercent;
	}

	public void setPassingPercent(int passingPercent) {
		this.passingPercent = passingPercent;
	}

	public int getRightAns() {
		return rightAns;
	}

	public void setRightAns(int rightAns) {
		this.rightAns = rightAns;
	}

	public int getWrongAns() {
		return wrongAns;
	}

	public void setWrongAns(int wrongAns) {
		this.wrongAns = wrongAns;
	}

	public int getSkipAns() {
		return skipAns;
	}

	public void setSkipAns(int skipAns) {
		this.skipAns = skipAns;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public List<CategoriesEntity> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoriesEntity> categories) {
		this.categories = categories;
	}
 
}
