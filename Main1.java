import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main1{
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Sam", 32, 75000.00));
        empList.add(new Employee(2, "Dam", 29, 70000.00));
        empList.add(new Employee(3, "Pam", 25, 65000.00));
        empList.add(new Employee(4, "Moore", 25, 80000.00));
        empList.add(new Employee(5, "Doug", 33, 50000.00));
        empList.add(new Employee(6, "Steve", 30, 79000.00));
        empList.add(new Employee(7, "Chris", 22, 60000.00));
        empList.add(new Employee(8, "Ron", 35, 85000.00));
        empList.add(new Employee(9, "Robert", 23, 70000.00));
        empList.add(new Employee(10, "Donald", 27, 85000.00));
        

        // Return true or false for lambda function
        Predicate<Double> pr = (a)->(a>70000);
        
        for (Employee employee : empList) {
            if(pr.test(employee.getSalary())){
                System.out.println(employee);
            }
        }

        System.out.println("------------------------------");

        Predicate<String> stringPr = a->(a.length()>4);

        for (Employee employee : empList) {
            if(stringPr.test(employee.getName())){
                System.out.println(employee);
            }
        }
    }
}