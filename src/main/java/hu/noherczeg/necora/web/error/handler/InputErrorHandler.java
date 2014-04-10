package hu.noherczeg.necora.web.error.handler;

import hu.noherczeg.necora.web.DetailedMessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class InputErrorHandler {

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ResponseBody
    public DetailedMessageDTO processUnsupportedMediaTypeError(HttpMediaTypeNotSupportedException ex) {
        return new DetailedMessageDTO(HttpStatus.UNSUPPORTED_MEDIA_TYPE.value(), "Not Supported", null, "The given MediaType is not supported on the requested Resource!");
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ResponseBody
    public DetailedMessageDTO processNotAcceptableError(HttpMediaTypeNotAcceptableException ex) {
        return new DetailedMessageDTO(HttpStatus.NOT_ACCEPTABLE.value(), "Not Acceptable", null, "The Server couldn't serve any Content-Type that the Client would accept!");
    }

}
