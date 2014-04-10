package hu.noherczeg.necora.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DetailedMessageDTO {

    private int statusCode;
    private String message;
    private String errorCode;
    private String description;

    public DetailedMessageDTO(int statusCode, String message, String errorCode, String description) {
        this.statusCode = statusCode;
        this.message = message;
        this.errorCode = errorCode;
        this.description = description;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }

}
