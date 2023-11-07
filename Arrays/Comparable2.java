import java.util.*;

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }   
}

class MyCmp implements Comparator<Point>{
    public int compare(Point p1, Point p2){
        return p1.x - p2.x;
    }
}

public class Comparable2 {
    public static void main(String[] args) {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(3, 2);
        Point point3 = new Point(2, 7);

        Point[] points = {point1, point2, point3};

        Arrays.sort(points, new MyCmp());

        System.out.println("Sorted points:");
        for (Point point : points) {
            System.out.println("(" + point.x + ", " + point.y + ")");
        }

        for(int i = 0; i < points.length; i++) {
            System.out.println(points[i].x+" "+points[i].y);
        }
    }
}
