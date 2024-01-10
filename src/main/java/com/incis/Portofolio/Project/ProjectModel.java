package com.incis.Portofolio.Project;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_projects")
public class ProjectModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prj_id")
    private Long projectId;

    @Column(name = "prj_name")
    private String projectName;

    @Column(name = "total_budget")
    private BigDecimal totalBudget;
}
