package POO.Herencia;

public class Main {
    static void main(String[] args) {
        Employee emp1 = new Developer("Ana", 2000, 5);
        Employee emp2 = new Manager("Carlos", 3000, 10);

        emp1.showInfo();
        System.out.println("------------");
        emp2.showInfo();
    }
}
