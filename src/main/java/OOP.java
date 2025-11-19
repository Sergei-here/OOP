public class OOP {

    public static void main(String[] args) {
        Line line1 = new Line(1, 3, 5, 8);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.end, line2.start);
        System.out.println("Линия 3 до изменений:" + line3);

        line3.start.x = 5;
        line3.end.x = 5;
        line3.start.y = 5;
        line3.end.y = 5;
        System.out.println("Линия 3 после изменения:" + line3);

        double lengthLine123 = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех линий:" + lengthLine123);
    }
}
