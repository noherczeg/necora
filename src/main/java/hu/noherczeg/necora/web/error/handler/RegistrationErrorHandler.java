package hu.noherczeg.necora.web.error.handler;

import hu.noherczeg.necora.exception.UserAlreadyExistsException;
import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RegistrationErrorHandler {

	@ExceptionHandler(UserAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
	@ResponseBody
    public DetailedMessageDTO processUserExistsError(UserAlreadyExistsException ex) {
        return new DetailedMessageDTO(HttpStatus.CONFLICT.value(), "User already exists", null, "Couldn't register User because one with the same credentials already exists");
    }
	
}
