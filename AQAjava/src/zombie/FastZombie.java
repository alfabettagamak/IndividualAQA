package zombie;

public class FastZombie implements Zombie{
    @Override
    public void walk() {
        System.out.println("top-top-top-top-top");
    }

    @Override
    public void talk() {
        System.out.println("ARRRRR!!!!!!");
    }

    @Override
    public void eat() {
        System.out.println("fast BRAIN!!!!!!");
    }
}
