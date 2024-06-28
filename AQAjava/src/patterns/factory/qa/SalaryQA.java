package patterns.factory.qa;

public class SalaryQA extends Salary{


    @Override
    public Employer createEmployer(LevelEnum  level) {
        return new QA(level);
    }

    public float calculateSalary(LevelEnum levelEnum){
        Employer employer = createEmployer(levelEnum);
        System.out.println(employer.getLevel().value);
        System.out.println("Do this work:");
        employer.doWork();
        float grade = this.grade.get(employer.getLevel());
        float salary = 100000 * grade * super.koeff * employer.getKoeff();
        System.out.println("Salary for " + levelEnum + " " + salary);

        return salary;
    }

}
