package gr.hometutors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hometutors.model.ProfAds;
import gr.hometutors.model.Professor;
import gr.hometutors.repository.ProfAdsRepository;

@Service
public class ProfAdsService {

	@Autowired
	ProfAdsRepository profAdsRepository;

	// WHY IS THIS NOT CREATING THE PROFADS????????
	public void createOne() {
		Professor professor = new Professor();
		ProfessorService professorService = new ProfessorService();
		professor = professorService.findById((long) 1);
		ProfAds profAd1 = new ProfAds();
		profAd1.setInformation("ewofijowijef");
		profAd1.setReviewCode("testcode");
		profAd1.setProfessor(professor);
		//professor.getProfAds().add(profAd1);
		profAdsRepository.save(profAd1);
	}
}
