package builders;

import shapes.Triangle;

public class TriangleBuilder {
    private Triangle triangle;

    public TriangleBuilder() {
        this.triangle = new Triangle();
    }

    public TriangleBuilder centerXCoord(Integer x) {
        triangle.setCenterXCoord(x);
        return this;
    }

    public TriangleBuilder centerYCoord(Integer y) {
        triangle.setCenterYCoord(y);
        return this;
    }

    public TriangleBuilder sideA(Integer sideA) {
        triangle.setA(sideA);
        return this;
    }

    public TriangleBuilder sideB(Integer sideB) {
        triangle.setB(sideB);
        return this;
    }

    public TriangleBuilder sideC(Integer sideC) {
        triangle.setC(sideC);
        return this;
    }

    public TriangleBuilder color(String color) {
        triangle.setColor(color);
        return this;
    }


    public TriangleBuilder withDefaults() {
        return this
                .color("BLACK")
                .sideA(4)
                .sideB(3)
                .sideC(2)
                .centerXCoord(0)
                .centerYCoord(0);
    }

    public Triangle build() {
        return triangle;
    }

}
