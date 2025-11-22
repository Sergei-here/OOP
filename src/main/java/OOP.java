public class OOP {

    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        polyLine.addPoint(new Point(1, 5));
        polyLine.addPoint(new Point(2, 8));
        polyLine.addPoint(new Point(5, 3));
        polyLine.addPoint(new Point(8, 9));
        System.out.println("1. Ломанная линия:" + polyLine);

        double polyLineLength = polyLine.getLength();
        System.out.println("2. Длина ломаной: " + polyLineLength);

        Line[] lines = polyLine.getLines();
        System.out.println("3. Массив линий:");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }

        double linesLength = 0.0;
        for (int i = 0; i < lines.length; i++) {
            Line currentLine = lines[i];
            double lineLength = currentLine.getLength();
            linesLength += lineLength;
        }
        System.out.println("4. Длина массива линий: " + linesLength);

        System.out.println("5. Сравнение длин:" + (Math.abs(polyLineLength - linesLength) < 0.0000001));

        System.out.println("6. Изменение координат:");
        polyLine.points[1] = new Point(12, 8);
        System.out.println("Ломанная после изменения : " + polyLine);

        Line[] updatedLines = polyLine.getLines();
        System.out.println("Массив двух линий после изменения:");
        for (int i = 0; i < updatedLines.length - 1; i++) {
            Line currentLine = updatedLines[i];
            System.out.println(currentLine);
        }
    }
}
