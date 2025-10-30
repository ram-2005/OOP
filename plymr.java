
// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        // Base version (can be overridden)
        return salary * 0.05;
    }
}

// Derived class: Manager
class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        // Managers get 10% bonus
        return salary * 0.10;
    }
}

// Derived class: Intern
class Intern extends Employee {

    Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateBonus() {
        // Interns get 2% bonus
        return salary * 0.02;
    }
}

// Main class to demonstrate polymorphism
public class plymr {
    public static void main(String[] args) {
        // Array of base class type
        Employee[] employees = new Employee[3];

        employees[0] = new Manager("Alice", 80000);
        employees[1] = new Intern("Bob", 20000);
        employees[2] = new Employee("Charlie", 50000);

        // Demonstrating runtime polymorphism
        for (Employee emp : employees) {
            System.out.println(emp.name + "'s bonus: ₹" + emp.calculateBonus());
        }
    }
}
