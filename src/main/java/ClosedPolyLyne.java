class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {
        // Используем длину из родительского класса (без замыкания)
        double baseLength = super.length();
        // Если меньше 2 точек, замкнутая длина тоже 0
        if (points.length < 2) {
            return baseLength;
        }
        // Расстояние от последней точки до первой для замыкания
        double lenX = points[points.length - 1].x - points[0].x;
        double lenY = points[points.length - 1].y - points[0].y;
        double closingLength = Math.sqrt(lenX * lenX + lenY * lenY);
        return baseLength + closingLength;
    }
}