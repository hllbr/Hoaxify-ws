package com.hoaxifySecond.ws.shared;

import javax.validation.Payload;
import javax.validation.Constraint;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {FileTypeValidator.class})
public @interface FileType {

    String message() default "{hoaxify.constraint.FileType.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String[] types();
}
