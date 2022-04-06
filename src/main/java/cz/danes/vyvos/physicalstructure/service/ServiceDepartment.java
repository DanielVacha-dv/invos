package cz.danes.vyvos.physicalstructure.service;

import cz.danes.vyvos.data.entity.Department;
import cz.danes.vyvos.physicalstructure.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceDepartment {
    @Autowired
    private DepartmentRepository departmentRepo;

    public List<Department> getAll() {
        List<Department> result = new ArrayList<>();
        departmentRepo.findAll().forEach(result::add);
        return result;
    }
}
