import java.util.*;
class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point other) {
        return this.x - other.x; // incresing order
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    
   
}

public class ComparableIn {
    public static void main(String[] args) {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(3, 2);
        Point point3 = new Point(2, 7);

        Point[] points = {point1, point2, point3};

        Arrays.sort(points);

        System.out.println("Sorted points:");
        for (Point point : points) {
            System.out.println(point);
        }

        for(int i = 0; i < points.length; i++) {
            System.out.println(points[i].x+" "+points[i].y);
        }
    }
}
