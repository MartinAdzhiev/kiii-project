package mk.ukim.finki.kiiiproject.model.exceptions;

public class DoctorNotFoundException extends RuntimeException{
    public DoctorNotFoundException(Long id) {
        super(String.format("Doctor with id: %d was not found", id));
    }
}
