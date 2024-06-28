package patterns.factory.qa;

public class QA implements Employer{

    private float koeff = 1.05f;

    public QA(LevelEnum level) {
        this.level = level;
    }

    private LevelEnum level = null;

    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Override
    public float getKoeff() {
        return this.koeff;
    }

    @Override
    public void doWork() {
        switch (level) {
            case JUNIOR: {
                test();
                makeTestCase();
                break;
            }
            case MIDDLE: {
                test();
                makeTestCase();
                develop();
                break;
            }
            case SENIOR:
                test();
                makeTestCase();
                develop();
                System.out.println("Teach");
                break;
        }

    }

    private void test(){
        System.out.println("Test");
    }

    private void makeTestCase(){
        System.out.println("Make testCAse");
    }

    private void develop(){
        System.out.println("Roll out to prod");
    }
}
