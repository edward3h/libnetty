package com.github.fmjsjx.libnetty.http.server.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation that indicates a method return value should be bound to the HTTP
 * response body as type {@code "application/json"}.
 * <p>
 * Supported for {@link HttpRoute} annotated handler methods
 * 
 * @since 1.1
 *
 * @author MJ Fang
 * 
 * @see HttpRoute
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface JsonResult {

    String charsetName() default "UTF-8";

}
