package builders;

import shapes.Circle;

public class CircleBuilder {
    private Circle circle;

    public CircleBuilder() {
        this.circle = new Circle();
    }

    public CircleBuilder centerXCoord(Integer x) {
        circle.setCenterXCoord(x);
        return this;
    }

    public CircleBuilder centerYCoord(Integer y) {
        circle.setCenterYCoord(y);
        return this;
    }

    public CircleBuilder diameter(Integer diameter) {
        circle.setDiameter(diameter);
        return this;
    }

    public CircleBuilder color(String color) {
        circle.setColor(color);
        return this;
    }


    public CircleBuilder withDefaults() {
        return this
                .color("RED")
                .diameter(10)
                .centerXCoord(0)
                .centerYCoord(0);
    }

    public Circle build() {
        return circle;
    }

}
