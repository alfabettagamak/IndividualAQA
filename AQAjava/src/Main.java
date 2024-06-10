import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



          String str = "21132123-dfsdfsd-23432423-3333-xczcxzc-3311334";
          int counter = -1;
          int index = 5555;
          for (String strItem: str.split("")){
              counter++;
              if (strItem.equals("d")){
                  index = counter;
                  break;
                  // comment;
              }
          }
        System.out.println(index);

//
//        System.out.println(str.substring(str.indexOf('d'), str.indexOf("23432423")));
//        System.out.println(str.substring(1));
//
//
//        String [] strArray = str.split("-");
//        boolean isCorrect = false;
//        for (String item: strArray) {
//            if (item.matches("[0-9]*")) {
//                isCorrect = true;
//                break;
//            }
//        }
//        System.out.println("is Correct? " + isCorrect);

//        System.out.println("Age :");
//        Scanner input = new Scanner(System.in);
//        int age = input.nextInt();
//
//        String[] list = {"Milk", "Beer", "Tomato", "Salt", "Bread", "Water"};
//        for (String item: list){
//            if (age < 18 && item.equals("Beer")) continue;
//            System.out.println(item);
//        }

        int [] arrayNumbers = new int[100];

//        Random rnd = new Random();
//        for(int i = 0; i < arrayNumbers.length; i++){
//            int number = rnd.nextInt(100);
//            arrayNumbers[i] = number;
//            if (number == 55) break;
//        }
//
//        System.out.println(Arrays.toString(arrayNumbers));
//
//        int [] array2 = {3, 7, 5, 0, 1, 8};
          int [] array3 = {3, 7, 5, 0, 1, 8};
          Arrays.sort(array3);
          System.out.println(Arrays.toString(array3));
//
//        int [] array4 = Arrays.copyOfRange(array2, 1, 3);
//       // array4[3] = 100;
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array4));
//
//        String [] arrayString = new String[array3.length];
//        int i = 0;
//        for (int number : array3){
//            String numberStr = Integer.toString(number);
//            arrayString[i] = numberStr;
//            i++;
//        }
//        System.out.println(Arrays.toString(array3));
//        System.out.println(Arrays.toString(arrayString));
//        int b = Integer.parseInt("45555");

    }
}
