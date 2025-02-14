package com.example.demo.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
 
@Service
public class EmployeeServiceImpl implements EmployeeService {
 
	@Autowired
	EmployeeRepository repository;
 
	@Override
	public String addEmployee(Employee employee) {
		Employee save = repository.save(employee);
		if(save != null) {
			return "Employee saved succefully";
		}
		else
			return "Faild save Employee  " ;
	}
 
}
 