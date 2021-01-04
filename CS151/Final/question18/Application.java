package FinalQuestions.question18;

import java.util.ArrayList;

public class Application {
    EmployeeDataStorage dataStorage;

    public Application(EmployeeDataStorage ds) {
        this.dataStorage = ds;
    }

    public void printEmployee(int id) {
        System.out.println(dataStorage.getEmployee(id));
    }

    public void printAllEmployees() {
        ArrayList<String> allEmployees = dataStorage.getAllEmployees();
        for (String employee : allEmployees) {
            System.out.println(employee);
        }
    }
}
