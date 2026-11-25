package com.seduc2.entities.repository;

import com.seduc2.entities.entity.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiranhaRepository extends JpaRepository<Miranha, Integer> {

}
