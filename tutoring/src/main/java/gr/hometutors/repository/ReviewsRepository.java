package gr.hometutors.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gr.hometutors.model.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

}
