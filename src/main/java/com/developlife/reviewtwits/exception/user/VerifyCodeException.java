package com.developlife.reviewtwits.exception.user;

/**
 * @author ghdic
 * @since 2023/03/03
 */
public class VerifyCodeException extends RuntimeException {
    public VerifyCodeException(String message) {
        super(message);
    }
}
