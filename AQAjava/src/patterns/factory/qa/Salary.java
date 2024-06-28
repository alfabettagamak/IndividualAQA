package patterns.factory.qa;

import java.util.HashMap;

public abstract class Salary {

    protected final Float koeff = 1.05f;

    abstract public Employer createEmployer(LevelEnum level);

    public HashMap <LevelEnum, Float> grade;

    public Salary(){
        this.grade = new HashMap<>();
        grade.put(LevelEnum.JUNIOR, 1.45f);
        grade.put(LevelEnum.MIDDLE, 2.45f);
        grade.put(LevelEnum.SENIOR, 3.45f);
    }
}
