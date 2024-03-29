package com.sbc.repo;

import org.springframework.data.repository.CrudRepository;

import com.sbc.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
