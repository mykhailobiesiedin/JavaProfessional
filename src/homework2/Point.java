package homework2;
// 1 уровень сложности: Домашнее задание
//
//         Дан список точек на плоскости, каждая точка описана координатами (x,y). Верните N точек наиболее близких к началу координат (0,0).
//         Точку реализуйте в виде класса Point(X,Y). Список точек реализуйте в виде коллекции List.
//         Пример:
//         На входе: (0,1), (2,2), (5,5); N=2
//         На выходе: (0,1), (2,2)
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(){
        return Math.sqrt(x*x + y*y);
    }



}
