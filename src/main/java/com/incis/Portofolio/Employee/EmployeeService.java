package com.incis.Portofolio.Employee;

import java.math.BigDecimal;
import java.util.List;

public interface EmployeeService {
    
    EmployeeModel getEmployeeById(Integer id);

    List<String> getHighSalaryEmployeeNames(BigDecimal threshold);

    List<Object[]> getEmployeeDetailsWithSalaryAndDepartment(String department, BigDecimal salary);
}
