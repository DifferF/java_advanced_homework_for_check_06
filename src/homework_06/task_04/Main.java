package homework_06.task_04;


import java.lang.annotation.*;

/**
 * Задание 4+
 * Создать свою аннотацию, которая будет содержать параметры для метода,
 * выполнить сложение 2-х чисел.
 *
 * @Math(num1 = 100, num2 = 200)
 * public void mathSum(int num1, int num2)
 */

public class Main {
    public static void main(String[] args) {
        AdditionClas myO = new AdditionClas();
        Class<?> clasAC = AdditionClas.class;
        Math mathAnno = clasAC.getAnnotation(Math.class);
        myO.mathSum(mathAnno.num1(), mathAnno.num2());
    }
}

@Math(num1 = 100, num2 = 200)
class AdditionClas{
    public void mathSum(int num1, int num2){
        System.out.println("mathSum = " + (num1 + num2));
    }
}


@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Math{
    int num1();
    int num2();
}
