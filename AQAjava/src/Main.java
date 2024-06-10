import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String firstStr = "12345";
//        String firstStr1 = new String("12345");
//
//        int a = 5;
//
//        String secondFirst = "12345";
//        String secondStr1 = new String("12345");
//
//        Boolean result = firstStr1 == secondStr1;
//
//        Boolean result1 = firstStr.equals(secondFirst);
//        char aa = 'a';

//        System.out.println("Введите ваш возраст");
        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//
//        if (age  < 18) {
//            System.out.println("Разрешение родителей");
//            System.out.println("Оно у вас есть?" );
//            String answer = input.next();
//            if (answer.equals("ДА") || answer.equals("да") || answer.equals("yes")) {
//                System.out.println("Пришлите разрешение на почту");
//            }
//        }
//        else if (age < 50 && age > 25){ // || - или
//            System.out.println("20% ставка");
//        }
//        else {
//            System.out.println("отказ");
//        }
//
//        System.out.println("Введите значение 1, 2, 3 или 4");
//
//        int number = input.nextInt();
//
//        String str = (number == 100) ? "Сто" : "Не сто";
//
//        switch (number){
//            case 1:
//                System.out.println("args =  1");
//                break;
//            case 2:
//                System.out.println("args =  2");
//                break;
//            default:
//                System.out.println("Не подходит");
//        }
//         final int months = 12;
//         // ! 0 = 1
//        // ! 3 = 1 * 2 * 3
//         int sum = 0;
//         for (int i = 1; i <= 10; i++){
//              //sum = sum + i;
//              sum += i;
//             if (i != 10) {
//                 System.out.print(i + " + ");
//             }
//             else
//                 System.out.print(i);
//         }
//        System.out.println(" = " + sum);
        //  1 * 1    2 * 1
        //  1 * 2    2 * 2
        //  1 * 3    2 + 3
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(i);
                System.out.print(" * ");
                System.out.print(j);
                System.out.print(" = ");
                System.out.print(i * j);
                System.out.println();
            }
            System.out.println();
        }

        Random rnd = new Random();

        int rndNumber = 0;
        int k = 0;
        while (k < 9){
            // 1000  1000000
            rndNumber = 1000 + rnd.nextInt(1000000);
            System.out.println(rndNumber);
            k++;
        }

        do {
            rndNumber = rnd.nextInt(10000);
            System.out.println(rndNumber);
            k++;
        } while (k < 15);

    }
}