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
	public ResponseEntity<ExamEntity> addExam(@RequestBody ExamEntity examEntity) {
		ExamEntity examEntityObj = examService.addExam(examEntity);
		return new ResponseEntity<>(examEntityObj, HttpStatus.CREATED);
	} 

	@GetMapping
	public ResponseEntity<List<ExamEntity>> getExamData1() {
		List<ExamEntity> examEntities = examService.getexamData();
		return new ResponseEntity<>(examEntities, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public ResponseEntity<ExamEntity> getExamByID(@PathVariable Long id) {
		ExamEntity examEntity = examService.findById(id).get();
		return new ResponseEntity<>(examEntity, HttpStatus.OK);
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
