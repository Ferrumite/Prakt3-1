public class MovableRectangle extends MovablePoint implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;


    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public void MoveUp() {
        topLeft.MoveUp();
        bottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        topLeft.MoveDown();
        bottomRight.MoveDown();
    }

    @Override
    public void MoveLeft() {
        topLeft.MoveLeft();
        bottomRight.MoveLeft();
    }

    @Override
    public void MoveRight() {
        topLeft.MoveRight();
        bottomRight.MoveRight();
    }

    boolean checkSpeeds(int x, int y) {
        if(topLeft.getxSpeed() == bottomRight.getxSpeed() && topLeft.getySpeed() == bottomRight.getySpeed())
            return true;
        else
            return false;
    }
}
