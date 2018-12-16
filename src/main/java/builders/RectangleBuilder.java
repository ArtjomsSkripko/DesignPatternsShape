package builders;

import shapes.Rectangle;

public class RectangleBuilder {
    private Rectangle rectangle;

    public RectangleBuilder() {
        this.rectangle = new Rectangle();
    }

    public RectangleBuilder centerXCoord(Integer x) {
        rectangle.setCenterXCoord(x);
        return this;
    }

    public RectangleBuilder centerYCoord(Integer y) {
        rectangle.setCenterYCoord(y);
        return this;
    }

    public RectangleBuilder length(Integer length) {
        rectangle.setLength(length);
        return this;
    }

    public RectangleBuilder width(Integer width) {
        rectangle.setWidth(width);
        return this;
    }

    public RectangleBuilder color(String color) {
        rectangle.setColor(color);
        return this;
    }


    public RectangleBuilder withDefaults() {
        return this
                .color("GREEN")
                .length(15)
                .width(8)
                .centerXCoord(0)
                .centerYCoord(0);
    }

    public Rectangle build() {
        return rectangle;
    }

}
