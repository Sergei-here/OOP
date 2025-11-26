import java.util.Arrays;

public class OOP {

    public static void main(String[] args) {

        Student student1 = new Student("Петя"); // У Пети не было оценок
        Student student2 = new Student("Маша", new int[]{5, 4}); // У Маши были две оценки

        System.out.println(student1); // У Пети не было оценок
        System.out.println(student2); // У Маши были две оценки

        student1.addGrade(5); // Добавляем оценки
        student2.addGrade(4);

        // Получаем оценки
        int[] grades = student1.getGrades();
        System.out.println("Петя: " + Arrays.toString(grades)); // Оценки Пети после добавления

        int[] grades1 = student2.getGrades();
        System.out.println("Маша: " + Arrays.toString(grades1)); // Оценки Маши после добавления
    }
}
