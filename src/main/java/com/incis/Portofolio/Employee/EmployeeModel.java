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

}
