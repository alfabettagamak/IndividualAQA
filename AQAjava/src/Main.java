import qa.*;
import zombie.*;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QA qa = new QA();
        qa.setLevel(LevelEnum.SENIOR);

        AQA aqa = new AQA();
        aqa.setLevel(LevelEnum.MIDDLE);

        SalaryQA sqa = new SalaryQA();
        float salary = sqa.calculateSalary(aqa);
        System.out.println("My salary: " + salary);

        ArrayList <Employer> list = new ArrayList<Employer>();
        list.add(qa);
        list.add(aqa);
        for (Employer emloyer: list){
            System.out.println("LEVEL: " + emloyer.getLevel());
            System.out.println("koeff: " + emloyer.getKoeff());
        }


//        Zombie zombie = new ClassicZombie();
//        zombie.eat();
//        Zombie zombie1 = new FastZombie();
//        zombie1.eat();
//        Policeman sherif = new Sherrif();
//        sherif.shoot();
//        ZombieSherif zSherrif = new ZombieSherif();
//
//        Car car = new Car(zSherrif);
//        ZombieSherif driver = car.getPolicemanDriver();
//        driver.shoot();
//        driver.talk();




//          int maxInt = Integer.MAX_VALUE;
//          int b = maxInt + 1;
//
//          MathObject myObject = new MathObject(4, "some");
//          int f = myObject.factorial(10000000);
//          System.out.println(f);

//        Book myBook = new Book("Harry Potter", 600);
//        myBook.open(100);
//
//        Magazine magazine = new Magazine();
//        magazine.open(5555);
//        System.out.println(myBook.toString());


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

