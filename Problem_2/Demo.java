public class Demo
{
    public static void main(String[] args) {
        MovablePoint movPoint = new MovablePoint(1.0f, 2.0f, 1.5f, 2.5f);

        System.out.println("Initial: " + movPoint);

        movPoint.move();
        System.out.println("After first move: " +movPoint);

        movPoint.move();
        System.out.println("After second move: " +movPoint);

        movPoint.setSpeed(2.0f, -1.0f);
        movPoint.move();
        System.out.println("After speed change and move: " + movPoint);
    }
}
