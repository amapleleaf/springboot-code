package com.maple.learn.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({LoggerService.class,MonitorImportSelector.class,CounterDefinitionRegistrar.class})
public @interface EnableCustService {

}
