import patterns.singleton.DataBaseClient;
import patterns.singleton.builder.Builder;
import patterns.singleton.builder.User;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        DataBaseClient db = DataBaseClient.getInstance();
        DataBaseClient db1 = DataBaseClient.getInstance();

        Builder builder = new Builder();
        User user = builder.withName("Alsu").withAge(25).withMiddleName("Ivanova").build();

        Date date = new Date();
        long millis = date.getTime();


//        GregorianCalendar calendar = new GregorianCalendar(2012,Calendar.DECEMBER,31);
//        System.out.println(calendar.getTimeInMillis());
//
//        Bad bad = new Bad();
//        ArrayList<OurExceprtion> errors = new ArrayList<>();
//        for (int i=0; i < 10; i++){
//            try {
//                System.out.println(bad.flaky());
//            }
//            catch (OurExceprtion exception){
//                System.out.println(exception.getMessage());
//                errors.add(exception);
//            }
//        }
//
//        for (OurExceprtion exception: errors){
//            System.out.println(exception);
//        }
//
//        Date date1 = new Date();
//        System.out.println("this code works : " + (date1.getTime() - date.getTime()));
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy'T'HH:mm:ss:S'Z'");
//        //System.out.println("DATE " + simpleDateFormat.format(date));
//
//        TimeZone tz = TimeZone.getTimeZone("America/ Los_Angeles");
//        simpleDateFormat.setTimeZone(tz);
//
//        Date date2 = simpleDateFormat.parse("15-12-2000T00:00:25:345Z");
//        var a = 5;


//        try {
//            System.out.println("Input number");
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//            System.out.println("Do some");
//            var aa = 5/0;
//            System.out.println("Do some");
//        }
//        catch (ArithmeticException e){
//            System.out.println("BLOCK catch");
//            System.out.println("Message " + e.getMessage());
//            throw new Exception("OLOLOLOLO");
//        }
//        catch (InputMismatchException e){
//            System.out.println("This is not number");
//        }
//        finally {
//            System.out.println("FINALY");
//        }
//
//
//        MathObject.printSome("RRTYTUYU");
//        MathObject math1 = new MathObject();
////        MathObject.someStatic = 5 + MathObject.someStatic;
//        MathObject math2 = new MathObject();
//        math2.printSome("HHHH");
//        int [] array = {1, 3, 5, 6, 8};
//        var list1 = Arrays.asList(array);
//
//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(6);
//        int index = list.indexOf(6);
//
//        ArrayList <String> strArray = new ArrayList<>();
//        strArray.add("sdfsdf");
//        strArray.add("34");
//        strArray.add("gdfgdf");
//
//        // ссылка на предыдущий - значение - ссылка на следующий
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(3453);
//        linkedList.add(5555);
//        linkedList.add(3477753);
//        linkedList.add(333);
//        var a = 4;
//
//        HashSet<Integer> hashSet = new HashSet<>();
//        hashSet.add(3345);
//        hashSet.add(33);
//        hashSet.add(11);
//        hashSet.add(5465464);
//        hashSet.add(1);
//        hashSet.add(1);
//        String strHash = "rerere";
//        System.out.println(strHash.hashCode());
//        String strHash1 = "rerere";
//        System.out.println(strHash1.hashCode());
//        System.out.println(hashSet);
//
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(25, "werwerwre");
//        hashMap.put(25, "rrrrrrr");
//        hashMap.put(435435, "rrrrrrr");
//        hashMap.put(5645645, "rrrrrrr");
//
//
//        TreeMap<Integer, String> hashMap1 = new TreeMap<>();
//        hashMap1.put(25, "werwerwre");
//        hashMap1.put(25, "rrrrrrr");
//        hashMap1.put(435435, "gfhfhfjg");
//        hashMap1.put(5645645, "rrrrrrr");
//        hashMap1.put(1, "rrrrrrr");
//        var e = 5;



       // List <Employer> a = new ArrayList<Employer>();


//        QA qa = new QA();
//        qa.setLevel(LevelEnum.SENIOR);
//
//        AQA aqa = new AQA();
//        aqa.setLevel(LevelEnum.MIDDLE);
//
//        SalaryQA sqa = new SalaryQA();
//        float salary = sqa.calculateSalary(aqa);
//        System.out.println("My salary: " + salary);
//
//        ArrayList <Employer> list = new ArrayList<Employer>();
//        list.add(qa);
//        list.add(aqa);
//        for (Employer emloyer: list){
//            System.out.println("LEVEL: " + emloyer.getLevel());
//            System.out.println("koeff: " + emloyer.getKoeff());
//        }


//        Zombie zombie = new ClassicZombie();
//        zombie.eat();
//        Zombie zombie1 = new FastZombie();
//        zombie1.eat();
//        Policeman sherif = new Sherrif();
//        sherif.shoot();
//        ZombieSherif zSherrif = new ZombieSherif();
//
//        Car <MathObject> car = new Car<>(math1);
//        Car <Policeman> car1 = new Car<>(sherif);
//
//        ZombieSherif driver = car.getPolicemanDriver();
//        driver.shoot();
//        driver.talk();
//



//          int maxInt = Integer.MAX_VALUE;
//          int b = maxInt + 1;
//
//          MathObject myObject = new MathObject(4, "some");
//          int f = myObject.factorial(10000000);
//          System.out.println(f);

//        book.Book myBook = new book.Book("Harry Potter", 600);
//        myBook.open(100);
//
//        book.Magazine magazine = new book.Magazine();
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

