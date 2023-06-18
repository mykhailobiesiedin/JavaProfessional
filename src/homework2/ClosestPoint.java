package homework2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestPoint {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(0, 2));
        points.add(new Point(0, 1));
        points.add(new Point(1, 2));

        int number = 1;
        List<Point> pointList = findClosestPoint(points, number);

        for (Point point: pointList){
            System.out.println("(" + point.getX() + "," + point.getY() + ")");
        }
    }

    public static List<Point> findClosestPoint(List<Point> points, int number){
        points.sort(Comparator.comparingDouble(Point::getDistance));
        return points.subList(0, number);
    }
}
