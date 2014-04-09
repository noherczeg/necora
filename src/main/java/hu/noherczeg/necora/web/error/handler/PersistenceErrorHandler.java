package hu.noherczeg.necora.web.error.handler;

import hu.noherczeg.necora.exception.EntityDeletionException;
import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class PersistenceErrorHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersistenceErrorHandler.class);
	
	@ExceptionHandler(EntityDeletionException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
    public DetailedMessageDTO processEntityDeletionException(EntityDeletionException ex) {
        LOGGER.error(ex.getMessage(), ex);
        return new DetailedMessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Entity deletion error", null, "Couldn't delete the selected Entity!");
    }
	
}
