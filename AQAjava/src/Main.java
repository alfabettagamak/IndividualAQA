import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book myBook = new Book("Harry Potter", 600);
        myBook.open(100);

        Magazine magazine = new Magazine();
        magazine.open(5555);
        System.out.println(myBook.toString());


//        MathObject myObject = new MathObject(4, "some");
//
//        myObject.setName("Name Func");
//
//        MathObject myObject1 = new MathObject();
//
//        int f = myObject.factorial(99);
//        System.out.println(f);
//
//        int number = myObject.sum(2, 3, 7);
//
//        System.out.println(number);

    }

}

