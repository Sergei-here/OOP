public class Point { // создали класс Точка

    int x, y;

    public Point(int x, int y) { // объявили конструктор
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}


