package com.incis.Portofolio.Employee;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<EmployeeModel> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping(path = "/id/{id}")
    public @ResponseBody EmployeeModel getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
        
    }

    @GetMapping(path = "/higher/{threshold}")
    public @ResponseBody List<String> getHighestSalaryEmployee(@PathVariable BigDecimal threshold){
        return employeeService.getHighSalaryEmployeeNames(threshold);
    }

    @GetMapping(path = "/dept/{deptid}/higher/{salary}")
    public @ResponseBody List<Object[]> getEmployeeSalaryDepartment(@PathVariable("deptid") String deptId, @PathVariable("salary") BigDecimal salary){
        return employeeService.getEmployeeDetailsWithSalaryAndDepartment(deptId, salary);
    }
}
