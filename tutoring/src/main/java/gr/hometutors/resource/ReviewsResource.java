package gr.hometutors.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hometutors.service.ReviewsService;

@RestController
@RequestMapping(path = "/reviews")
public class ReviewsResource {

	@Autowired
	ReviewsService reviewsService;
}
