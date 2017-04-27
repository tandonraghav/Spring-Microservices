package com.prafull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prafull.entity.Test;
import com.prafull.entity.TestRepository;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/main")
@RefreshScope
public class RestController {
	
	@Autowired private TestRepository testRepo;
	@Value("${checking:Hello default}")private String message;
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
	public String search(@RequestBody Test user){
		return message;
	}
}
