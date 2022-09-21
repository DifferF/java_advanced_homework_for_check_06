package homework_06.task_03;

import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface PiyPiyAnno {

    String myString() default "Meow";
    int myInt_1() default 10;
    int myInt_2() default 20;
}
