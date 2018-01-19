package com.lin.commonspring.advice;


import com.lin.commonspring.exception.AbstractBaseException;
import com.lin.commonspring.model.view.ErrorWrapView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
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

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ErrorWrapView handleBindException(org.springframework.validation.BindException e) {
        logger.error("ExceptionAdvice handleBindException {},{}", e.getAllErrors().get(0).getCode(),
                e.getAllErrors().get(0).getDefaultMessage());
        return new ErrorWrapView(Integer.parseInt(e.getAllErrors().get(0).getCode()),
                e.getAllErrors().get(0).getDefaultMessage());
    }


    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ErrorWrapView handleValidationException(UnsatisfiedServletRequestParameterException exception) {
        return new ErrorWrapView(100001, "输入参数有误");
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ErrorWrapView handleValidationException(MissingServletRequestParameterException exception) {
        return new ErrorWrapView(100001, "输入参数有误");
    }
}