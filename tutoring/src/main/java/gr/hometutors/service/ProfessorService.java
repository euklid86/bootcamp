package gr.hometutors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hometutors.model.ProfAds;
import gr.hometutors.model.Professor;
import gr.hometutors.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	ProfessorRepository professorRepository;

	public Professor findById(Long id) {
		return professorRepository.findOne(id);
	}

	public List<Professor> findAll() {
		return professorRepository.findAll();
	}

	public void createOne() {
		ProfAds profAd1 = new ProfAds();
		ProfAds profAd2 = new ProfAds();
		profAd1.setInformation("efnwoefinwe");
		profAd1.setReviewCode("wjofnowefn");
		profAd2.setInformation("woiefnowiefn");
		profAd2.setReviewCode("wejfnwoefnoweff");
		Professor professor = new Professor();
		professor.setEmail("wefwef");
		professor.setFname("efef");
		professor.setLname("wioefnwoienf");
		professor.setLocation("efwef");
		professor.setPhone("12314");
		professor.getProfAds().add(profAd1);
		professor.getProfAds().add(profAd2);
		professor.setProfession("wefwf");
		professor.setSecretCode("efw");
		professorRepository.save(professor);
	}
}
