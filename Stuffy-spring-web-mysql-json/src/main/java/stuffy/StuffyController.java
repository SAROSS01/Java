package stuffy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import stuffy.Stuffy;

@Controller
@RequestMapping("/stuffy")
public class StuffyController {
	@Autowired
	
	private stuffyRepository stuffyRepository;

	@GetMapping("/add") // Map ONLY GET Requests
	
	public @ResponseBody String addNewStuffy (@RequestParam  String type
			, @RequestParam String color, @RequestParam String size, @RequestParam int limbs) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Stuffy s = new Stuffy();
		s.setType(type);
		s.setColor(color);
		s.setSize(size);
		s.setLimbs(limbs);
		stuffyRepository.save(s);
		return "Saved";
	}
	
	@PostMapping("/")

	public @ResponseBody String addStuffy(@RequestBody Stuffy stuffy) {

		stuffyRepository.save(stuffy);

		return "Stuffy saved";

	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Stuffy> getAllUsers() {
		// This returns a JSON or XML with the users
		return stuffyRepository.findAll();
	}
	
	@DeleteMapping("/delete")

	public @ResponseBody String deleteStuffy(@RequestBody Stuffy stuffy) {

		stuffyRepository.delete(stuffy);

		return "stuffy deleted";

	}
}

