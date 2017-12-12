package com.lin.commonspring.advice;


import com.lin.commonspring.exception.AbstractBaseException;
import com.lin.commonspring.model.view.ErrorWrapView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * 用于requestMapping exceprionHandler
 */
@ControllerAdvice
public class ExceptionAdvice {

    private static Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ErrorWrapView handleCustomException(AbstractBaseException e) {
        logger.error("ExceptionAdvice handleCustomException {},{}", e.getCode(), e.getMsg());
        return new ErrorWrapView(e.getCode(), e.getMsg());
    }
}
