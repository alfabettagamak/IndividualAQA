package qa;

public class SalaryQA extends Salary{

    @Override
    public float calculateSalary(Employer employer){
        System.out.println(employer.getLevel().value);
        System.out.println("Do this work:");
        employer.doWork();
        return super.calculateSalary(employer);
    }

    public float calculateSalary2(Employer employer){
        System.out.println(employer.getPosition()+ " "+ employer.getLevel() );
        System.out.println(employer.getPosition().value + " " + employer.getLevel().value);
        return super.calculateSalary(employer);
    }
}
