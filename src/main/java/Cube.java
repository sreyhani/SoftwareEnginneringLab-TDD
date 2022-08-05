class Cube implements Shape {

    Cube(int side) {
        this.side = side;
    }

    public int computeArea() {
        return side * side;
    }

    int getSide() {
        return side;
    }

    void setSide(int side) {
        this.side = side;
    }

    private int side;
}
