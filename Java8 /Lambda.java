interface Employee {
    String run();
}

class ComputerScience implements Employee {
    public String run() {
        return "Cse Employee";
    }
}

public class Lambda {
    public static void main(String[] args) {

        // First we make an interface and then we make its implemation class
        Employee e1 = new ComputerScience();
        System.out.println(e1.run());

        // Rather for on the go implemetation of functional interface do this
        Employee e2 = () -> "Mechanical Employee";
        System.out.println(e2.run());

    }
}
