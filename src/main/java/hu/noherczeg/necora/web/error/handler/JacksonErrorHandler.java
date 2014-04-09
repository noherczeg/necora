package hu.noherczeg.necora.web.error.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class JacksonErrorHandler {

	@ExceptionHandler(JsonProcessingException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
    public DetailedMessageDTO processUserExistsError(JsonProcessingException ex) {
        return new DetailedMessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Data serialization error", null, "Couldn't serialize original Data!");
    }
	
}
