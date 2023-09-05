package mk.ukim.finki.kiiiproject.service;

import mk.ukim.finki.kiiiproject.model.Department;
import mk.ukim.finki.kiiiproject.model.Doctor;
import mk.ukim.finki.kiiiproject.model.Hospital;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    public Optional<Doctor> findById(Long id);

    public Page<Doctor> findAllWithPagination(Integer page, Integer size);

    public Page<Doctor> filterAndPaginate(String departmentName, String hospitalName, Integer page, Integer size);
    public Optional<Doctor> add(String name, String surname, Long departmentId, Long hospitalId);
}
