package code.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class AccessException extends Exception {
    public AccessException(String message) {
        super(message);
    }
}
