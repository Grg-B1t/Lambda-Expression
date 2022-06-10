public class Employee {
    private int EmpID;
    private String name;
    private int age;
    private double salary;
    
    public Employee(int empID, String name, int age, double salary) {
        EmpID = empID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getEmpID() {
        return EmpID;
    }
    public void setEmpID(int empID) {
        EmpID = empID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [EmpID=" + EmpID + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
    }

    
}
