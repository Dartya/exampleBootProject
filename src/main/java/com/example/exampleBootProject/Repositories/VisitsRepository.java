package com.example.exampleBootProject.Repositories;

import com.example.exampleBootProject.Models.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long> {
}
