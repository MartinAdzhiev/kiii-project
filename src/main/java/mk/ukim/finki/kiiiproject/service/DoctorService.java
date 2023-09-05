package mk.ukim.finki.kiiiproject.service;

import mk.ukim.finki.kiiiproject.model.Department;
import mk.ukim.finki.kiiiproject.model.Doctor;
import mk.ukim.finki.kiiiproject.model.Hospital;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    public Optional<Doctor> findById(Long id);

    public List<Doctor> findAll();
    public Optional<Doctor> add(String name, String surname, Long departmentId, Long hospitalId);
}
