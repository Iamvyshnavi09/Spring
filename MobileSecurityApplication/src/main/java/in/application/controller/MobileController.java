package in.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.application.modal.Mobile;
import in.application.service.MobileService;

@RestController
public class MobileController {
	@Autowired
	 private MobileService mobileservice;
	 
	@RequestMapping(value="/mobile", method=RequestMethod.GET)
	
	public List<Mobile> getAllMobile() {
		return mobileservice.getAllMobile();
	}
	@RequestMapping(value="/mobile/add", method=RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE USER')")
	public String addMobile(@RequestBody Mobile mobile) {
		
		mobileservice.addMobile(mobile);
	return "PostMethod";
		
	}
	@RequestMapping(value="/mobile/{id}", method=RequestMethod.PUT)
	public String updateMobile(@PathVariable int id,@RequestBody Mobile mobile) {
		mobileservice.updateMobile(id,mobile);
		return "putmethod";
	}
	@RequestMapping(value="/mobile/{id}", method=RequestMethod.DELETE)
	@PreAuthorize("hasRole('ROLE ADIMN')")
	public String deleteMobile(@PathVariable int id) {
		mobileservice.deleteMobile(id);
		return "deletemethod";
	}
	
	
	
	
	
	
}
