package zombie;

public class ZombieSherif implements Zombie, Policeman{
    @Override
    public void shoot() {
        System.out.println("piu-piu");

    }

    @Override
    public void walk() {
        System.out.println("slow");
    }

    @Override
    public void talk() {
        System.out.println("ZZZZZZ");
    }

    @Override
    public void eat() {
        System.out.println("everything");

    }
}
