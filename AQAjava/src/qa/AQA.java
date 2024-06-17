package qa;

import static qa.LevelEnum.JUNIOR;

public class AQA implements Employer{

    private final float koeff = 1.5f;

    private LevelEnum level = null;

    public LevelEnum getLevel() {
        return level;
    }

    @Override
    public float getKoeff() {
        return this.koeff;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    @Override
    public void doWork() {
        switch (level) {
            case JUNIOR: {
                test();
                makeAutoTest();
                break;
            }
            case MIDDLE: {
                test();
                makeAutoTest();
                codeReview();
                break;
            }
            case SENIOR:
                makeAutoTest();
                codeReview();
                System.out.println("Teach junior qa");
                break;
        }

    }

    private void test(){
        System.out.println("Test");
    }

    private void makeAutoTest(){
        System.out.println("Make autotest");
    }

    private void codeReview(){
        System.out.println("Code review");
    }
}
