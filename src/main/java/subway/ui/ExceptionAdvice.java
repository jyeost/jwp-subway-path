package subway.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import subway.exception.InvalidInputException;

@ControllerAdvice
public class ExceptionAdvice {
    
    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<String> handleInvalidInputException(final InvalidInputException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
    
    /*@ExceptionHandler(Exception.class)
    void ss(final Exception e) {
        Arrays.stream(e.getStackTrace()).forEach(System.out::println);
        
    }*/
}