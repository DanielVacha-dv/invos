package cz.danes.vyvos.physicalstructure.service;

import cz.danes.vyvos.data.entity.DepartmentED;
import cz.danes.vyvos.physicalstructure.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDepartment {
    @Autowired
    private DepartmentRepository departmentRepo;

    public List<DepartmentED> getAll() {
        List<DepartmentED> result = new ArrayList<>();
        departmentRepo.findAll().forEach(result::add);
        return result;
    }

    public void deleteById(long departmentID) {
        departmentRepo.deleteById(departmentID);
    }

    public void add(DepartmentED department) {
        departmentRepo.save(department);
    }
    
    public void update(DepartmentED department) {
        departmentRepo.save(department);
    }
}
