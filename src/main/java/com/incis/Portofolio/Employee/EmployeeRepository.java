package com.incis.Portofolio.Employee;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    
    
    @Query("SELECT e.employeeId, e.employeeName, e.salary, p.projectName, p.totalBudget " +
           "FROM EmployeeModel e " +
           "JOIN ProjectAsigneeModel epa ON e.employeeId = epa.employee.employeeId " +
           "JOIN ProjectModel p ON epa.project.projectId = p.projectId " +
           "WHERE e.departmentId = :department AND e.salary > :salary " +
           "ORDER BY e.employeeName")
    List<Object[]> getEmployeeDetailsWithSalaryAndDepartmentJPQL(
        @Param("department") String department,
        @Param("salary") BigDecimal salary
    );

    //example of advanced native sql query
    @Query(value = "SELECT e.empl_id, e.empl_name, e.empl_salary, p.prj_name, p.total_budget " +
           "FROM t_employees e " +
           "JOIN t_employee_project_assignment epa ON e.empl_id = epa.employee_id " +
           "JOIN t_projects p ON epa.project_id = p.prj_id " +
           "WHERE e.empl_department = :department AND e.empl_salary > :salary " +
           "ORDER BY e.empl_name", nativeQuery = true)
    List<Object[]> getEmployeeDetailsWithSalaryAndDepartment(
        @Param("department") String department,
        @Param("salary") BigDecimal salary
    );
}