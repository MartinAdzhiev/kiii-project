package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Page<Doctor> findAll(Pageable pageable);
    Page<Doctor> findAllByDepartment_Name(String name, Pageable pageable);
    Page<Doctor> findAllByHospital_Name(String name, Pageable pageable);
    Page<Doctor> findAllByDepartment_NameAndHospital_Name(String department, String hospital, Pageable pageable);
}
