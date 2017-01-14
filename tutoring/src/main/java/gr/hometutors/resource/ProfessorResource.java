package gr.hometutors.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gr.hometutors.model.Professor;
import gr.hometutors.service.ProfessorService;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorResource {

	@Autowired
	ProfessorService professorService;

	@RequestMapping(path = "all", method = RequestMethod.GET)
	public ResponseEntity<List<Professor>> getAll() {
		List<Professor> profList = new ArrayList<Professor>();
		profList = professorService.findAll();
		return ResponseEntity.ok(profList);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Professor> getById(@PathVariable(name = "id") Long id) {
		Professor professor = professorService.findById(id);
		return ResponseEntity.ok(professor);
	}

	@RequestMapping(path = "/createOne")
	public void createOne() {
		professorService.createOne();
	}
}
