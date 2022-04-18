package cz.danes.vyvos.physicalstructure.repository;

import cz.danes.vyvos.data.entity.DepartmentED;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentED, Long> {
}
