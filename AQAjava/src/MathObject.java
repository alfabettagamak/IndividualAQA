public class MathObject {

    private int length;
    private String name;

    public MathObject(){
        System.out.println("OLOLO");
    }

    public MathObject(int length, String name){
        this.length = length;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int factorial(int number){
        // 5! = 1 * 2 * 3 * 4 * 5
        // 0! = 1
        // 1 ! = 1
        // 2! = 1! * 2
        // 3! = 2! * 3
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    private int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b, int c){
        return this.sum(a, b) + c;
    }

    public Boolean isCorrect(String name){
        return true;
    }

    public void some(Book book){
        System.out.println(book.name);
    }
}
