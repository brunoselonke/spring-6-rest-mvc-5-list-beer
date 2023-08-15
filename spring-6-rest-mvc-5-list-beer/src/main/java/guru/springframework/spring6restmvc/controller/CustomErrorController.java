package guru.springframework.spring6restmvc.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
        ResponseEntity handleBindErros(MethodArgumentNotValidException exception){
            return ResponseEntity.badRequest().body(exception.getBindingResult().getFieldErrors());
        }
}
