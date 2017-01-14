package gr.hometutors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hometutors.repository.ReviewsRepository;

@Service
public class ReviewsService {

	@Autowired
	ReviewsRepository reviewsRepository;
}
