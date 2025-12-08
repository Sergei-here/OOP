public class OOP {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);

        PolyLine polyLine = new PolyLine(p1, p2, p3);

        double length1 = polyLine.length();
        System.out.println("Длина PolyLine: " + length1);

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);

        double length2 = closedPolyLine.length();
        System.out.println("Длина ClosedPolyLine: " + length2);
    }
}
