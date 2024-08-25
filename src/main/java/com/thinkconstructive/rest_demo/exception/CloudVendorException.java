package com.thinkconstructive.rest_demo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;
    private final Throwable throwble;
    private final HttpStatus httpsStatus;

    
    public CloudVendorException(String message, Throwable throwble, HttpStatus httpsStatus) {
        this.message = message;
        this.throwble = throwble;
        this.httpsStatus = httpsStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowble() {
        return throwble;
    }

    public HttpStatus getHttpsStatus() {
        return httpsStatus;
    }


}
