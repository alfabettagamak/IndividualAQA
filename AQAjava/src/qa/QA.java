package qa;

public class QA implements Employer{

    private float koeff = 1.05f;

    private LevelEnum level = null;

    private PositionsEnum position = null;

    public LevelEnum getLevel() {
        return level;
    }

    @Override
    public PositionsEnum getPosition() {
        return position;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Override
    public float getKoeff() {
        return this.koeff;
    }

    public void setPosition(PositionsEnum position) {
        this.position = position;
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
