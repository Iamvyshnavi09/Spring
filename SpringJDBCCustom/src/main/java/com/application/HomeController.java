package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HomeController {
	
	
	 @Autowired  
	 JdbcTemplate jdbc;  
	 @RequestMapping("/insert")  
	    public String index(){  
	 jdbc.execute("insert into studendetails(id,name,country)values(5,'karthik','Pakisthan')");
	 System.out.println("data insertion working");
	return"Data is inserted in to data base";

}
}
