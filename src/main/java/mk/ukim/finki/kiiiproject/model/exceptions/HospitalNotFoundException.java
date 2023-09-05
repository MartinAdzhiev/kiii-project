package mk.ukim.finki.kiiiproject.model.exceptions;

public class HospitalNotFoundException extends RuntimeException{
    public HospitalNotFoundException(Long id) {
        super(String.format("Hospital with id: %d was not found", id));
    }
}
