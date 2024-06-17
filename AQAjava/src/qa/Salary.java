package qa;

import java.util.HashMap;

public abstract class Salary {

    private final Float koeff = 1.05f;

    public HashMap <LevelEnum, Float> grade;

    public Salary(){
        this.grade = new HashMap<>();
        grade.put(LevelEnum.JUNIOR, 1.45f);
        grade.put(LevelEnum.MIDDLE, 2.45f);
        grade.put(LevelEnum.SENIOR, 3.45f);
    }

    public float calculateSalary(Employer employer){
        float grade = this.grade.get(employer.getLevel());
        float salary = 100000 * grade * koeff * employer.getKoeff();
        return salary;
    }

}
