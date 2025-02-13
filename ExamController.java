package com.indrayani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.indrayani.entity.ExamEntity;
import com.indrayani.service.ExamService;

@RestController
@RequestMapping("/exams")
public class ExamController {

	@Autowired
	private ExamService examService;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ExamEntity addExam(@RequestBody ExamEntity examEntity) {
		 
		examService.addExam(examEntity);
		return examEntity;

	}

	@GetMapping
	public List<ExamEntity> getexamData() {
		List<ExamEntity> examEntity = examService.getexamData();
		return examEntity;
	}

	@GetMapping("{id}")
	public ExamEntity getExamByID(@PathVariable Long id) {
		ExamEntity examEntity = examService.findById(id).get();
		return examEntity;
	}

	@PutMapping("/{id}")
	public ResponseEntity<ExamEntity> updateExamById(@PathVariable Long id, @RequestBody ExamEntity examEntity) {
		ExamEntity examEntityObj = examService.updateExamById(id, examEntity);
		if (examEntityObj != null) {
			return ResponseEntity.ok(examEntityObj);

		} else {
			return ResponseEntity.notFound().build();
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ExamEntity> deleteExamById(@PathVariable Long id) {
		examService.deleteExamById(id);
		return ResponseEntity.noContent().build();
	}

}
