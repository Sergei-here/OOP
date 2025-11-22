public class PolyLine {
    Point[] points;  // Массив точек ломаной

    // Конструктор без параметров (пустая ломаная)
    public PolyLine() {
        this.points = new Point[0];  // Пустой массив
    }

    // Метод для добавления точки в ломаную
    public void addPoint(Point point) {
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }
        newPoints[points.length] = point;
        points = newPoints;
    }

    // Метод для получения массива линий ломаной
    public Line[] getLines() {
        if (points.length < 2) {
            return new Line[0];
        }
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i + 1]);
        }
        return lines;
    }

    // Метод для вычисления длины ломаной
    public double getLength() {
        double totalLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int deltaX = points[i + 1].x - points[i].x;
            int deltaY = points[i + 1].y - points[i].y;
            totalLength += Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }
        return totalLength;
    }

    // Текстовое представление ломаной
    public String toString() {
        String result = "[";
        for (int i = 0; i < points.length; i++) {
            result += points[i];
            if (i < points.length - 1) {
                result += ",";
            }
        }
        result += "]";
        return result;
    }
}
