package com.indrayani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indrayani.entity.ExamEntity;
import com.indrayani.repository.ExamRepository;

@Service
public class ExamService {

	@Autowired
	private ExamRepository examRepository;

	public ExamEntity addExam(ExamEntity examEntity) {
		return examRepository.save(examEntity);
	}

	public List<ExamEntity> getexamData() {
		return examRepository.findAll();
	}

	public Optional<ExamEntity> findById(Long id) {
		return examRepository.findById(id);
	}

	public ExamEntity updateExamById(Long id, ExamEntity examEntity) {

		boolean isExist = examRepository.existsById(id);
		if (isExist) {
			examEntity.setId(id);
			return examRepository.save(examEntity);
		} else {
			return null;
		}

	}

	public void deleteExamById(Long id) {
		examRepository.deleteById(id);
	}
}
