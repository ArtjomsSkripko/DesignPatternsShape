package decorator;

import shapes.Shape;

public class LineThicknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThicknessDecorator(Shape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line thickness: " + thickness);
    }

    @Override
    public void move(Integer x, Integer y) {
        decoratedShape.move(x, y);
    }

    @Override
    public void enlarge(Integer times) {
        decoratedShape.enlarge(times);
    }

    @Override
    public void minimize(Integer times) {
        decoratedShape.minimize(times);
    }

    @Override
    public void changeColor(String color) {
        decoratedShape.changeColor(color);
    }
}
