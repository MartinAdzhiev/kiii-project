package mk.ukim.finki.kiiiproject.service;

import mk.ukim.finki.kiiiproject.model.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {

    public Optional<Hospital> findById(Long id);
    public List<Hospital> findAll();
    public Optional<Hospital> add(String name, String city);
}
