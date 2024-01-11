public class Main {
    public static void main(String[] args) {
        Point distance = new Point(6, 5);
        Point distance1 = new Point(3, 1);
        System.out.println("distance to origin:" + distance.distance());

        System.out.println("distance given points:" + distance.distance(2, 2));

        System.out.println("distance given Point Object:" + distance.distance(distance1));
    }
}