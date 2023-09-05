package mk.ukim.finki.kiiiproject.repository;

import mk.ukim.finki.kiiiproject.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
