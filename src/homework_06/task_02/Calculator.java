package homework_06.task_02;


/**
 * @author Maxim Salikov
 */
@MyAnno
public class Calculator {

    /**
     * @param num_01 private int поле
     * @param num_02 private int поле
     */
    private int num_01;
    private int num_02;

    /**
     * @param num_01 число 1 в конструкторе класса Calculator
     * @param num_02 число 2 в конструкторе класса Calculator
     */
    public Calculator(int num_01, int num_02) {
        this.num_01 = num_01;
        this.num_02 = num_02;
    }

    /**
     * @return Сложение
     */
    public String additionCalc(){
        return " additionCalc |" + (num_01 + num_02);
    }

    /**
      * @return Вычитание
     */
    public int subtractionCalc(){
        return (num_02 - num_01);
    }

    /**
     * @param num_1 множитель
     * @param num_2 второй множитель
     * @return произведение чисел
     */
    public int multiplicationCalc(int num_1, int num_2){
        return num_1 * num_2;
    }

    /**
     * @param num_1 делимое
     * @param num_1 делитель в данном примере берем из аннотации @MyAnno
     * результат печатаем в консоль
     */
    public void divisionCalc(int num_1){
        System.out.println(" divisionCalc |" + (num_01 / num_1));
    }
}
