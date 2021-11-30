public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    MovablePoint center = new MovablePoint(10, 10, 2, 2);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }


}
