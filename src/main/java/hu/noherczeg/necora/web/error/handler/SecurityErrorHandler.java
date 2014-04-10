package hu.noherczeg.necora.web.error.handler;

import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.acls.model.NotFoundException;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class SecurityErrorHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityErrorHandler.class);

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    public DetailedMessageDTO processAccessDeniedError(AccessDeniedException ex) {
        return new DetailedMessageDTO(HttpStatus.FORBIDDEN.value(), "Access denied", null, "Insufficient permissions to access requested resource");
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ResponseBody
    public DetailedMessageDTO processAclNotFoundIdentityError(NotFoundException ex) {
        LOGGER.error("Acl error: " + ex.getMessage());
        return new DetailedMessageDTO(HttpStatus.FORBIDDEN.value(), "Access denied", null, ex.getMessage());
    }

    @ExceptionHandler(AuthenticationServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public DetailedMessageDTO processAuthenticationError(AuthenticationServiceException ex) {
        LOGGER.error("Authentication error: ", ex);
        return new DetailedMessageDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal authentication error", null, ex.getMessage());
    }

}
