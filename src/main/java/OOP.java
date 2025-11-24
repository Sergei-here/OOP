import java.util.Arrays;

public class OOP {

    public static void main(String[] args) {

        Student student1 = new Student("Иван");
        Student student2 = new Student("Мария", new int[]{5, 4});

        System.out.println(student1); // Иван: []
        System.out.println(student2); // Мария: [5, 4]

        /*
        // Добавляем оценки
        student1.addGrade(5);
        student1.addGrade(3);
        student1.addGrades(new int[]{4, 2});


         */
        System.out.println(student1); // Иван: [5, 3, 4, 2]
/*
        // Получаем оценки
        int[] grades = student2.getGrades();
        System.out.println("Оценки Марии: " + Arrays.toString(grades));

 */
    }
}
