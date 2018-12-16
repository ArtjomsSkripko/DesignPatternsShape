package decorator;

import shapes.Shape;

public class GreenFillShapeDecorator extends ShapeDecorator {

    public GreenFillShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setGreenFill(decoratedShape);
    }

    private void setGreenFill(Shape decoratedShape){
        System.out.println("Shape fill color: Green");
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
