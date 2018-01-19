package com.lin.commonspring.annotation;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface PrimaryRespority {
}
