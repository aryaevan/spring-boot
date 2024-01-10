package com.incis.Portofolio.Employee;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    
    @Query("SELECT e.employeeId, e.employeeName, e.salary, p.projectName, p.totalBudget " +
           "FROM Employee e " +
           "JOIN EmployeeProjectAssignment epa ON e.employeeId = epa.employee.employeeId " +
           "JOIN Project p ON epa.project.projectId = p.projectId " +
           "WHERE e.departmentId = :department AND e.salary > :salary " +
           "ORDER BY e.employeeName")
    List<Object[]> getEmployeeDetailsWithSalaryAndDepartment(
        @Param("department") String department,
        @Param("salary") BigDecimal salary
    );
}
