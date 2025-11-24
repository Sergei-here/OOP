import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name) {
        this.name = name;
        this.grades = new int[0];
    }

    public Student(String name, int[] addGrades) {
        this.name = name;
        // Защитное копирование для инкапсуляции
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
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5: " + grade);
        }
    }

    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}

 /*   public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        checkGrade(grade); // проверяем оценку

        // Создаем новый массив на 1 больше
        int[] newGrades = new int[grades.length + 1];

        // Копируем старые оценки
        for (int i = 0; i < grades.length; i++) {
            newGrades[i] = grades[i];
        }
    }
}

  */
