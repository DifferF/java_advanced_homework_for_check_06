package homework_06.task_03;

/**
 * Задание 3+
 * Создайте несколько классов, один класс наследует другой и использует аннотацию Inherited.
 * Помимо этого, попробуйте ещё в проекте использовать 5 различных аннотаций.
 */

public class Main {

    public static void main(String[] args) {

        A myA = new A();
        B myB = new B();

        Class<?> clasA = A.class;
        PiyPiyAnno mathAnno = clasA.getAnnotation(PiyPiyAnno.class);
        myA.myMethodA(mathAnno.myString());
        myB.myMethodB(mathAnno.myInt_1());

        D myD = new D(mathAnno.myInt_1(),mathAnno.myInt_2());
        System.out.println("@PiyPiyAnno myInt_1 = " + myD.getTest_1() );
        System.out.println("@PiyPiyAnno myInt_2 = " + myD.getTest_2() );


        Class<?> clasE = E.class;
        PiyPiyAnno myAnno_2 = clasE.getAnnotation(PiyPiyAnno.class);
        E myE = new E();
        myE.myMethodE(myAnno_2.myInt_1(),myAnno_2.myInt_2(),myAnno_2.myString());
    }
}
