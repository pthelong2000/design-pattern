package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeExample2 {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alice");
        Worker worker2 = new Worker("Bob");

        Manager manager1 = new Manager("Charlie");
        manager1.addSubordinate(worker1);
        manager1.addSubordinate(worker2);

        Worker worker3 = new Worker("David");
        Worker worker4 = new Worker("Eve");

        Manager manager2 = new Manager("Frank");
        manager2.addSubordinate(worker3);
        manager2.addSubordinate(worker4);

        Manager ceo = new Manager("CEO");
        ceo.addSubordinate(manager1);
        ceo.addSubordinate(manager2);

        ceo.showDetails();
    }
}

// Component
interface Employee {
    void showDetails();
}

// Leaf
class Worker implements Employee {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Worker: " + name);
    }
}

// Composite
class Manager implements Employee {
    private String name;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee subordinate : subordinates) {
            subordinate.showDetails();
        }
    }
}