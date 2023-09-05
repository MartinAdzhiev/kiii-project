package mk.ukim.finki.kiiiproject.model.exceptions;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(Long id) {
        super(String.format("Department with id: %d was not found", id));
    }
}
