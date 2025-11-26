import java.util.Arrays;

public class Student {

    private final String name;
    private int[] grades;

    public Student(String name) {
        this.name = name;
        this.grades = new int[0];
    }

    public Student(String name, int[] addGrades) {
        this.name = name;
        if (addGrades != null) {
            for (int i = 0; i < addGrades.length; i++) {
                checkGrade(addGrades[i]);
            }
            this.grades = new int[addGrades.length];
            for (int i = 0; i < addGrades.length; i++) {
                this.grades[i] = addGrades[i];
            }
        }
    }

    private void checkGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка может быть от 2 до 5: " + grade);
        }
    }

    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        checkGrade(grade); // проверяем оценку
        int[] newGrades = new int[grades.length + 1]; // Создаем новый массив на 1 больше
        for (int i = 0; i < grades.length; i++) { // Копируем старые оценки
            newGrades[i] = grades[i];
        }
        newGrades[grades.length] = grade;
        grades = newGrades; // в новый массив
    }
}

