package qa;

public class SalaryQA extends Salary{

    @Override
    public float calculateSalary(Employer employer){
        System.out.println(employer.getLevel().value);
        System.out.println("Do this work:");
        employer.doWork();
        return super.calculateSalary(employer);
    }

}
