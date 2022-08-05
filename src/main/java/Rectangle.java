class Rectangle implements Shape {
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int computeArea() {
        return width * height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private int height;
}
