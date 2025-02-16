package io.reflectoring.diningreview.controller;

import io.reflectoring.diningreview.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Hvis en metode fejler i at returnere et objekt, fx findUserByName, vil det returnere en HTTP status 404: Not Found
 * Hvis den er fundet, ses det i controller-metoderne, at der returneres en HTTP ok-status.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
