package com.tipdm.java.exception;

/**
 * Created by zhoulong on 2017/1/20.
 * E-mail:zhoulong8513@gmail.com
 */
public class AlgorithmException extends RuntimeException {

    public AlgorithmException() {
        super();
    }

    public AlgorithmException(String msg) {
        super(msg);
    }

    public AlgorithmException(String msg, Throwable cause) {
        super(msg, cause);
    }
    public AlgorithmException(Throwable cause) {
        super(cause);
    }

}
