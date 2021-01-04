package FinalQuestions.question18;

public class Tester {
    public static void main(String[] args) {

        EmployeeDataStorage employeeDS = new EmployeeDataStorage();
        Application app = new Application(employeeDS);

        app.printEmployee(5);
        app.printAllEmployees();
    }
}
