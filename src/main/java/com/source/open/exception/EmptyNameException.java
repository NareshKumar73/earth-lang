package com.source.open.exception;

public class EmptyNameException extends RuntimeException {

    private static final long serialVersionUID = 1L;
	
	private String messageCode;

    public EmptyNameException(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageCode() {
        return messageCode;
    }
}
