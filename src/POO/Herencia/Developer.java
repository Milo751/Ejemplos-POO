package POO.Herencia;

public class Developer extends Employee {

    private int projectsCompleted;
    private double bonusPerProject = 100;

    public Developer(String name, double baseSalary, int projectsCompleted) {
        super(name, baseSalary); // llama al constructor padre
        this.projectsCompleted = projectsCompleted;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * bonusPerProject);
    }
}
