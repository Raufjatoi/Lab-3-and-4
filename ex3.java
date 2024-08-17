// 3. Employee Management:
// Create a class named Employee with attributes like name, ID, and salary.
// Create subclasses for Manager, Developer, and Tester inheriting from Employee.
// Add specific attributes and methods for each subclass (e.g., bonus for Manager,
// projectsHandled for Developer).
// Calculate the total salary for all employees, considering any bonuses or allowances.
import java.util.ArrayList;

class Employee {
    String name;
    int ID, salary;
    Employee(String name, int ID, int salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }
}
class Manager extends Employee {
    Manager(String name, int ID, int salary) {
        super(name, ID, salary);
    }
    void addBonus(int bonus) {
        this.salary += bonus;
    }
}
class Developer extends Employee {
    Developer(String name, int ID, int salary) {
        super(name, ID, salary);
    }

    void projectsHandled() {
        System.out.println("This project is handled by " + this.name);
    }
}

class Tester extends Employee {
    Tester(String name, int ID, int salary) {
        super(name, ID, salary);
    }
}
public class ex3 {
    public static void main(String[] args) {
        Developer rauf = new Developer("Rauf", 2, 10000);
        Manager ahsan = new Manager("Ahsan", 3, 200000);
        Tester umar = new Tester("Umar", 4, 400000);

        ahsan.addBonus(2000);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(rauf);
        list.add(ahsan);
        list.add(umar);

        int total = 0;
        for (Employee e : list) {
            total += e.salary;
        }
        System.out.println("Total salary is " + total);
    }
}
