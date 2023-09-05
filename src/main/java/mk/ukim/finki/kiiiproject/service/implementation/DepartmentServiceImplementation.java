package mk.ukim.finki.kiiiproject.service.implementation;

import mk.ukim.finki.kiiiproject.model.Department;
import mk.ukim.finki.kiiiproject.repository.DepartmentRepository;
import mk.ukim.finki.kiiiproject.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImplementation implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImplementation(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Optional<Department> findById(Long id) {
        return this.departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return this.departmentRepository.findAll();
    }

    @Override
    public Optional<Department> add(String name) {
        Department department = new Department(name);
        return Optional.of(this.departmentRepository.save(department));
    }
}
