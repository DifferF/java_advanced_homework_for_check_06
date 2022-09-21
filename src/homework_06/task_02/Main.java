package homework_06.task_02;

/**
Задание 2+
Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented,
либо же документационные комментарии.
 */


public class Main {

    public static void main(String[] args) {


        Class<?> clasM = Calculator.class;
        MyAnno mathAnno = clasM.getAnnotation(MyAnno.class);
        Calculator myCalculator = new Calculator(mathAnno.num_1(),mathAnno.num_2());

        System.out.println( myCalculator.additionCalc() );
        System.out.println(" subtractionCalc |" +  myCalculator.subtractionCalc() );
        System.out.println(" multiplicationCalc |" +  myCalculator.multiplicationCalc(mathAnno.num_1(),mathAnno.num_2()) );
        myCalculator.divisionCalc(mathAnno.num_2());
    }
}
