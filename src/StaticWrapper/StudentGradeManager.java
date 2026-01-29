package StaticWrapper;

public class StudentGradeManager {
    String fullName;
    Double quiz1;
    Double quiz2;
    Double midtermExam;
    Double finalExam;
    double aux;

    public StudentGradeManager(String fullName, String quiz1, String quiz2, String midtermExam, String finalExam) {
        this.fullName = formatNames(fullName);
        this.quiz1 = setGrade(quiz1);
        this.quiz2 = setGrade(quiz2);
        this.midtermExam = setGrade(midtermExam);
        this.finalExam = setGrade(finalExam);
    }

    public Double setGrade (String gradeText) {
        double grade;
        double reviewedGrade = 0.0;
        // gradeText = gradeText.trim();
        if (!gradeText.isBlank()) {
            grade = Double.parseDouble(gradeText);
            reviewedGrade = this.reviewGrade(grade);
        }
        return reviewedGrade;
    }

    public Double reviewGrade (Double grade) {
        if (grade != 0.0 && grade.compareTo(0.0) > 0 && grade.compareTo(5.0) < 0){
            return grade;
        }
        return 0.0;
    }

    public String formatNames (String fullName) {
        String normalizedName = "";

        fullName = fullName.trim();
        if (!fullName.isBlank()) {
            String[] splitName = fullName.split(" ");
            for (String n : splitName) {
                n = n.trim().toLowerCase();
                n = n.substring(0, 1).toUpperCase() + n.substring(1) + " ";
                normalizedName += n;
            }
        }
        return normalizedName.trim();
    }

    @Override
    public String toString() {
        System.out.println(quiz1.getClass().getSimpleName());
        System.out.println(((Object) aux).getClass().getSimpleName());
        return "StudentGradeManager{" +
                "fullName = '" + fullName + '\'' +
                ", quiz1 = " + quiz1 +
                ", quiz2 = " + quiz2 +
                ", midtermExam = " + midtermExam +
                ", finalExam = " + finalExam +
                '}';
    }
}
