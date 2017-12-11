package com.lin.commonspring.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Mapping
public @interface SignRequired {
}
