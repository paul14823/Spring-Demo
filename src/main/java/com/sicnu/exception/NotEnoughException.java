package com.sicnu.exception;

public class NotEnoughException extends RuntimeException{
    public NotEnoughException(){
        super();
    }
    public NotEnoughException(String Msg){
        super(Msg);
    }
}
