package mk.ukim.finki.kiiiproject.service.implementation;

import mk.ukim.finki.kiiiproject.model.Hospital;
import mk.ukim.finki.kiiiproject.repository.HospitalRepository;
import mk.ukim.finki.kiiiproject.service.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImplementation implements HospitalService {

    private final HospitalRepository hospitalRepository;

    public HospitalServiceImplementation(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public Optional<Hospital> findById(Long id) {
        return this.hospitalRepository.findById(id);
    }

    @Override
    public List<Hospital> findAll() {
        return this.hospitalRepository.findAll();
    }

    @Override
    public Optional<Hospital> add(String name, String city) {
        Hospital hospital = new Hospital(name, city);
        return Optional.of(this.hospitalRepository.save(hospital));
    }
}
