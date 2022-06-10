import java.util.Date;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda3 {
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
    
        Function<Double, Double> func = salary->salary + (0.1 * salary);
        Predicate<Integer> pr = a->(a>30);
        Predicate<Integer> pr1 = a->(a<=30);
        Consumer<String> con = sc->System.out.println("Congratulation " + sc + "! on your salary bonus!");
        Supplier<Date> sup = ()->new Date();

        for (Employee employee : empList) {
            if(pr.test(employee.getAge())){
                System.out.println("Name : " + employee.getName() + " | New salary : " + func.apply(employee.getSalary()));
                con.accept(employee.getName());
                System.out.println(sup.get());
            }
        }

        System.out.println("------------------------");
        // for (Employee employee : empList) {
        //     if(!(pr.test(employee.getAge()))){
        //         System.out.println("Name : " + employee.getName() + " | salary : " + employee.getSalary());
        //     }
        // }

        for (Employee employee : empList) {
            if(pr1.test(employee.getAge())){
                System.out.println("Name : " + employee.getName() + " | salary : " + employee.getSalary());
            }
        }


        
    }
}
