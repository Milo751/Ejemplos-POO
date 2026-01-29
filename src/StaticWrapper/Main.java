package StaticWrapper;

public class Main {
    static void main(String[] args) {
        // Student
        Student estudiante1 = new Student("Camilo");
        Student estudiante2 = new Student("Sofia");
        //Student estudiante3 = new Student("Luciana");
        Student estudiante4 = new Student("Jeronimo");

        estudiante1.saludar();
        estudiante2.saludar();
        //estudiante3.saludar();
        estudiante4.saludar();

        System.out.println("Total de estudiantes: " + Student.getTotalStudents());


        // House
        House casa1 = new House(3,5, 200);
        System.out.println("\nTengo una casa con " + casa1.getDoors() + " puertas, " + casa1.getRooms() + " cuartos y " + casa1.getSize() + " tamaño.");
        // casa1.size = 12;


        // Student Grade Manager
        StudentGradeManager notasEstudiantes1 = new StudentGradeManager(" camilo garcia ", "3.0 ", " 6", "3.5", " 4.1");
        System.out.println("\n" + notasEstudiantes1.toString());
    }
}
