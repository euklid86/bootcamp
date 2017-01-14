package gr.hometutors.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gr.hometutors.service.ProfAdsService;

@RestController
@RequestMapping(path = "/profads")
public class ProfAdsResource {

	@Autowired
	ProfAdsService profAdsService;

	@RequestMapping(path = "/createOne", method = RequestMethod.GET)
	public void createOne() {
		profAdsService.createOne();
	}
}
