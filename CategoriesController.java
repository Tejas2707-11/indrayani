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
import com.indrayani.entity.CategoriesEntity;
import com.indrayani.service.CategoriesService;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

	@Autowired
	private CategoriesService categoriesService;

	@PostMapping
	public ResponseEntity<CategoriesEntity> addCategories(@RequestBody CategoriesEntity categoriesEntity) {
		CategoriesEntity categoriesEntityObj = categoriesService.addCategories(categoriesEntity);
		return new ResponseEntity<>(categoriesEntityObj, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<CategoriesEntity>> getCategoriesData() {
		List<CategoriesEntity> categoriesEntities = categoriesService.getCategoriesData();
		return new ResponseEntity<>(categoriesEntities, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CategoriesEntity> getCategoriesByID(@PathVariable Long id) {
		CategoriesEntity categoriesEntity = categoriesService.findByID(id).get();
		return new ResponseEntity<>(categoriesEntity, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<CategoriesEntity> updateCategoriesById(@PathVariable Long id,
			@RequestBody CategoriesEntity categoriesEntity) {
		CategoriesEntity categoriesEntity1 = categoriesService.updateCategoriesById(id, categoriesEntity);
		if (categoriesEntity1 != null) {
			return ResponseEntity.ok(categoriesEntity1);

		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<CategoriesEntity> deleteCategoriesById(@PathVariable Long id) {
		categoriesService.deleteCategoriesById(id);
		return ResponseEntity.noContent().build();

	}

}
