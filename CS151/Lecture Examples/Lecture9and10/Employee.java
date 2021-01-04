package Lecture9and10;

import java.util.ArrayList;

public interface Employee {
    public double getTotalCompensation();
}




class Intern implements Employee {

    private final double SALARY_PER_HOUR = 35;
    private final int NUMBER_OF_HOURS_PER_WEEK = 40;
    private int numberOfWeeks;

    public Intern(int weeks) {
        this.numberOfWeeks = weeks;
    }

    @Override
    public double getTotalCompensation() {
        return numberOfWeeks * NUMBER_OF_HOURS_PER_WEEK * SALARY_PER_HOUR;
    }
}


class SoftwareEngineer implements Employee {
    private double salaryPerYear;

    public SoftwareEngineer(double salaryPerYear) {
        this.salaryPerYear = salaryPerYear;
    }

    @Override
    public double getTotalCompensation() {
        return salaryPerYear;
    }
}

class Company {
    private ArrayList<Employee> staff;

    public Company() {
        this.staff = new ArrayList<>();
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public double totalYearBudget() {
        double totalBudget = 0;
        for (Employee employee : staff) {
            totalBudget += employee.getTotalCompensation();
        }
        return totalBudget;
    }
}

class Tester {
    public static void main(String[] args) {

        Company myStartup = new Company();

        Intern garry = new Intern(12);
        SoftwareEngineer alice = new SoftwareEngineer(180000);
        SoftwareEngineer paul = new SoftwareEngineer(175000);

        myStartup.hire(garry);
        myStartup.hire(alice);
        myStartup.hire(paul);

        System.out.println(myStartup.totalYearBudget());

    }
}
