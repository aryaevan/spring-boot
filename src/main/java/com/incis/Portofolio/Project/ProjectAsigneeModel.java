package com.incis.Portofolio.Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.incis.Portofolio.Employee.EmployeeModel;

@Entity
@Table(name = "t_project_asignee")
public class ProjectAsigneeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long assignmentId;

    @ManyToOne
    @JoinColumn(name = "empl_id", referencedColumnName = "empl_id")
    private EmployeeModel employee;

    @ManyToOne
    @JoinColumn(name = "prj_id", referencedColumnName = "prj_id")
    private ProjectModel project;
}
