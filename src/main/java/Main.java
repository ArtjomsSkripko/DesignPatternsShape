import decorator.GreenFillShapeDecorator;
import decorator.LineThicknessDecorator;
import facade.ShapeFacade;
import iterator.Iterator;
import iterator.ShapeRepository;
import memento.CircleMemento;
import shapes.Circle;
import shapes.Oval;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        ShapeRepository repository = new ShapeRepository();
        ShapeFacade shapeFacade = new ShapeFacade();
        Iterator iterator = repository.getIterator();
        while (iterator.hasNext()) {
            Shape shape = (Shape) iterator.next();
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                if ("RED".equals(circle.getColor())) {
                    CircleMemento circleMemento = circle.saveDiameter();
                    shapeFacade.drawAndEnlargeShape(2, circle);
                    System.out.println("Circle diameter : " + circle.getDiameter());
                    circle.restoreDiameter(circleMemento);
                    System.out.println("Circle diameter after revert : " + circle.getDiameter());
                    printLine();
                } else {
                    shapeFacade.drawMinimizeAndChangeColorOfShape(4, "WHITE", circle);
                    System.out.println("Color of the circle is: " + circle.getColor());
                    printLine();

                }
            }

            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                shapeFacade.drawEnlargeAndMoveShape(3, 20, 10, rectangle);
                System.out.println("New coordinates x: " + rectangle.getCenterXCoord() +
                        " y: " + rectangle.getCenterYCoord());
                printLine();
            }

            if (shape instanceof Triangle) {
                GreenFillShapeDecorator greenFillShapeDecorator = new GreenFillShapeDecorator(shape);
                greenFillShapeDecorator.draw();
                printLine();
            }

            if (shape instanceof Oval) {
                LineThicknessDecorator lineThicknessDecorator = new LineThicknessDecorator(shape, 2.00);
                lineThicknessDecorator.draw();
                printLine();
            }
        }
    }

    private static void printLine(){
        System.out.println("-----------------------------------------------");
    }
}
