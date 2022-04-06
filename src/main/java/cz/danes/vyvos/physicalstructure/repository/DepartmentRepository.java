package cz.danes.vyvos.physicalstructure.repository;

import cz.danes.vyvos.data.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
