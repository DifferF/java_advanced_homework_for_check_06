package homework_06.task_03;


@PiyPiyAnno(myString = "myInt_1 + myInt_2 = ", myInt_1 = 2, myInt_2 = 2 )
public class E {

    @Deprecated
    public void myMethodE(int myInt_1, int myInt_2, String myStr) {
        System.out.println(myStr + " " + (myInt_1 * myInt_2));
    }
}
