public class Square implements HaveArea {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float computeArea() {
        return this.side * this.side;
    }
}
