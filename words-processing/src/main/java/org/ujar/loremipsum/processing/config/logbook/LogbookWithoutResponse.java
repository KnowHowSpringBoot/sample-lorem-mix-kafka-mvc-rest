package org.ujar.loremipsum.processing.config.logbook;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * Use {@link WithoutResponseBodyStrategy} by default
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({WithoutResponseBodyStrategy.class})
public @interface LogbookWithoutResponse {
}
