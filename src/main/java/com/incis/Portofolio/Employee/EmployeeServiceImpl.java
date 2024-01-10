package com.incis.Portofolio.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    //Autowiring is part of JAVA IOC
    @Autowired
    private EmployeeRepository repo;

    @Override
    public EmployeeModel getEmployeeById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    //method to demonstrate JAVA STREAM
    @Override
    public List<String> getHighSalaryEmployeeNames(BigDecimal threshold) {
        List<EmployeeModel> employees = repo.findAll();

        List<String> highSalaryEmployeeNames = employees.stream()
                .filter(employee -> employee.getSalary().compareTo(threshold) > 0)
                .map(EmployeeModel::getEmployeeName)
                .collect(Collectors.toList());

        return highSalaryEmployeeNames;
    }

    //this method use advanced NATIVE SQL QUERY to get result
    @Override
    public List<Object[]> getEmployeeDetailsWithSalaryAndDepartment(String department, BigDecimal salary) {
        return repo.getEmployeeDetailsWithSalaryAndDepartment(department, salary);
    }

    
    
}
