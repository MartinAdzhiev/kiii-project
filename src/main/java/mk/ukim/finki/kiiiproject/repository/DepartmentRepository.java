package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
