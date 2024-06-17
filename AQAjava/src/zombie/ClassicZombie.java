package zombie;

public class ClassicZombie implements Zombie{
    @Override
    public void walk() {
        System.out.println("top-top");
    }

    @Override
    public void talk() {
        System.out.println("rrrrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("brain");
    }
}
