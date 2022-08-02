public class Rectangle implements HaveArea {
    private float height;
    private float width;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public float computeArea() {
        return this.width * this.height;
    }
}
