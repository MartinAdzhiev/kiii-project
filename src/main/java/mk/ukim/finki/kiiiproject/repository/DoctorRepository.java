package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
