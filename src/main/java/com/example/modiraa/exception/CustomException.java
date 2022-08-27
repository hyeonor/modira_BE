package com.example.modiraa.exception;


public class CustomException extends RuntimeException{

    private final com.example.modiraa.exception.ErrorCode errorCode;

    public CustomException(com.example.modiraa.exception.ErrorCode errorCode){
        // RuntimeException -> Exception -> Throwable에서 message를 매개변수로 받아
        // detailMessage에 저장한 뒤, getMessage()를 통해 detailMessage를 반환한다.
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public com.example.modiraa.exception.ErrorCode getErrorCode(){
        return this.errorCode;
    }

}