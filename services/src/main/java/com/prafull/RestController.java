package com.prafull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prafull.dto.UserDto;
import com.prafull.entity.Test;
import com.prafull.entity.TestRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/main")
public class RestController {
	
	@Autowired private TestRepository testRepo;
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String search(@RequestBody Test user){
		Test t=new Test();
		t.setName(user.getName());
		testRepo.save(t);
		return user.toString();
	}
}
