package mk.ukim.finki.kiiiproject.service.implementation;

import mk.ukim.finki.kiiiproject.model.Department;
import mk.ukim.finki.kiiiproject.model.Doctor;
import mk.ukim.finki.kiiiproject.model.Hospital;
import mk.ukim.finki.kiiiproject.model.exceptions.DepartmentNotFoundException;
import mk.ukim.finki.kiiiproject.model.exceptions.HospitalNotFoundException;
import mk.ukim.finki.kiiiproject.repository.DepartmentRepository;
import mk.ukim.finki.kiiiproject.repository.DoctorRepository;
import mk.ukim.finki.kiiiproject.repository.HospitalRepository;
import mk.ukim.finki.kiiiproject.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImplementation implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DepartmentRepository departmentRepository;
    private final HospitalRepository hospitalRepository;

    public DoctorServiceImplementation(DoctorRepository doctorRepository, DepartmentRepository departmentRepository, HospitalRepository hospitalRepository) {
        this.doctorRepository = doctorRepository;
        this.departmentRepository = departmentRepository;
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public Optional<Doctor> findById(Long id) {
        return this.doctorRepository.findById(id);
    }

    @Override
    public List<Doctor> findAll() {
        return this.doctorRepository.findAll();
    }

    @Override
    public Optional<Doctor> add(String name, String surname, Long departmentId, Long hospitalId) {

        Department department = this.departmentRepository.findById(departmentId)
                .orElseThrow(() -> new DepartmentNotFoundException(departmentId));

        Hospital hospital = this.hospitalRepository.findById(hospitalId)
                .orElseThrow(() -> new HospitalNotFoundException(hospitalId));

        Doctor doctor = new Doctor(name, surname, department, hospital);

        return Optional.of(this.doctorRepository.save(doctor));
    }
}
