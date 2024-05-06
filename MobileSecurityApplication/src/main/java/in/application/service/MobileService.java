package in.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.application.modal.Mobile;
import in.application.repository.MobileRepository;

@Service
public class MobileService {
	
	
	@Autowired
	public MobileRepository mobilerepo;
	
	public List<Mobile>getAllMobile(){
		List<Mobile> list = new ArrayList<>();
		mobilerepo.findAll().forEach(list::add);
		return list;
	}
  
	public void addMobile(Mobile mobile) {
		mobilerepo.save(mobile);
	}
	
	public void updateMobile(int id,Mobile mobile) {
		mobilerepo.save(mobile);
	}
	
	
	public void deleteMobile(int id) {
		mobilerepo.deleteById(id);
	}
}
