package com.incis.Portofolio.Employee;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_employees")
public class EmployeeModel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "empl_id")
    private Integer employeeId;

    @Column(name = "empl_name")
    private String employeeName;
    
    @Column(name = "empl_salary")
    private BigDecimal salary;

    @Column(name = "empl_department")
    private String departmentId;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    
}
