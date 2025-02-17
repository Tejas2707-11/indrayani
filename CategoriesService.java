package com.indrayani.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indrayani.entity.CategoriesEntity;
import com.indrayani.repository.CategoriesRepository;

@Service
public class CategoriesService {

	@Autowired
	private CategoriesRepository categoriesRepository;

	public CategoriesEntity addCategories(CategoriesEntity categoriesEntity) {
		return categoriesRepository.save(categoriesEntity);
	}

	public List<CategoriesEntity> getActiveCategories(String active) {
		return categoriesRepository.getActiveCategories(active);

	}

	public List<CategoriesEntity> getCategoriesData() {
		return categoriesRepository.findAll();
	}

	public Optional<CategoriesEntity> findByID(Long id) {
		return categoriesRepository.findById(id);

	}

	public CategoriesEntity updateCategoriesById(Long id, CategoriesEntity categoriesEntity) {

		boolean isExist = categoriesRepository.existsById(id);
		if (isExist) {
			return categoriesRepository.save(categoriesEntity);
		} else {
			return null;
		}

	}

	public void save(CategoriesEntity categoriesEntity) {
	}
	
	public void deleteCategoriesById(Long id) {
		categoriesRepository.deleteById(id);
	}
}
