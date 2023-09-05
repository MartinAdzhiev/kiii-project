package mk.ukim.finki.kiiiproject.service;

import mk.ukim.finki.kiiiproject.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Optional<Department> findById(Long id);
    public List<Department> findAll();
    public Optional<Department> add(String name);
}
