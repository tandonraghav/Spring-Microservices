package com.prafull.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestRepository extends CrudRepository<Test, Long>{

}
