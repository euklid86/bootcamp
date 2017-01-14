package gr.hometutors.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hometutors.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
