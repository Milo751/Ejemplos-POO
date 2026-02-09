package POO.Herencia;

public class Manager extends Employee {

    private int teamSize;
    private double bonusPerMember = 50;

    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (teamSize * bonusPerMember);
    }
}
