package in.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import in.application.modal.College;
import in.application.repository.CollegeRepository;



@RestController
public class CollegeController {
	
	@Autowired
	CollegeRepository collegerepo;
	
	@PostMapping("/college")
	public ResponseEntity<College> postDetails(@RequestBody College college) {
		return new ResponseEntity<>(collegerepo.save(college),HttpStatus.CREATED);
		
	}
	@RequestMapping(value="/college", method=RequestMethod.GET)
	public List<College> getDetails() {
		return collegerepo.findAll();
	}

}
