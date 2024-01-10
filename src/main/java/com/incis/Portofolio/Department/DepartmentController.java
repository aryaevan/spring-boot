package com.incis.Portofolio.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/dept")
public class DepartmentController {
    
    @Autowired
    private DepartmentRepository deptRepo;

    @GetMapping
    public @ResponseBody Iterable<DepartmentModel> getAllDept(){
        return deptRepo.findAll();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody DepartmentModel getDeptById(@PathVariable Integer id){
        return deptRepo.findById(id).orElse(null);
    }

    @PostMapping
    public @ResponseBody DepartmentModel saveDepartment(@RequestBody DepartmentModel department) {
        return deptRepo.save(department);
    }
    
    @DeleteMapping(path = "/{id}")
    public void deleteDepartment(@PathVariable Integer id) {
        deptRepo.deleteById(id);
    }
}
