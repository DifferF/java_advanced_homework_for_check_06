package homework_06.task_02;

import java.lang.annotation.*;
/**
 * @author Maxim Salikov
 */
@Documented
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int num_1() default 20;
    int num_2() default 10;
}



