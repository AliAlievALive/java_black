package regex;

public class PrintfEx {
    static void employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n", employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));

    }
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Ali", "Aliev", 12345, .15);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 6542, .08);
        Employee employee3 = new Employee(123, "Mariya", "Sidorova", 8542, .12);
        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

//        String newStr = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",
//                1, "Ali", "Aliev", 12345 * (1 + .15));
//        System.out.println(newStr);
    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}