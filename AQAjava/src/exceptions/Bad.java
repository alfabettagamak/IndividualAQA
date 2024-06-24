package exceptions;

import java.util.Random;

public class Bad {

    Random rnd = new Random();
    public int a = 0;


    public int flaky() throws Exception {
        a = rnd.nextInt(10);
        division();
        return a;
    }

    private void division() throws Exception {
        try{
            a = a / rnd.nextInt(2);
        }
        catch (ArithmeticException e){
            System.out.println("OOOOPS");
            throw new OurExceprtions("Our Exception Message!");
        }
    }



}
