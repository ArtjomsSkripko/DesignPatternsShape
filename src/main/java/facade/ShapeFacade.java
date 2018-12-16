package facade;

import shapes.Shape;

public class ShapeFacade {

    public void drawMinimizeAndChangeColorOfShape(Integer times, String color, Shape shape){
        shape.draw();
        shape.minimize(times);
        shape.changeColor(color);
    }

    public void drawAndEnlargeShape(Integer times, Shape shape){
        shape.draw();
        shape.enlarge(times);
    }

    public void drawEnlargeAndMoveShape(Integer times, Integer x, Integer y, Shape shape){
        shape.draw();
        shape.enlarge(times);
        shape.move(x, y);
    }
}
