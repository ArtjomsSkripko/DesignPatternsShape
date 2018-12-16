package shapes;

import memento.CircleMemento;

public class Circle implements Shape{
    private Integer centerXCoord;
    private Integer centerYCoord;
    private Integer diameter;
    private String color;

    public Integer getCenterXCoord() {
        return centerXCoord;
    }

    public void setCenterXCoord(Integer centerXCoord) {
        this.centerXCoord = centerXCoord;
    }

    public Integer getCenterYCoord() {
        return centerYCoord;
    }

    public void setCenterYCoord(Integer centerYCoord) {
        this.centerYCoord = centerYCoord;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " circle with center coordinates x: " +
                getCenterXCoord() + " and y: " + getCenterYCoord() + " with diameter: " + getDiameter());
    }

    @Override
    public void move(Integer x, Integer y) {
        System.out.println("Moving circle to new coordinates x: " +
                x + " and y: " + y);
        this.centerXCoord = x;
        this.centerYCoord = y;
    }

    @Override
    public void enlarge(Integer times) {
        this.diameter = diameter * times;
        System.out.println("Enlarging circle by " + times + " times");
    }

    @Override
    public void minimize(Integer times) {
        this.diameter = diameter / times;
        System.out.println("Minimizing circle by " + times + " times");
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changing color of circle to " + color);
    }

    public CircleMemento saveDiameter() {
        return new CircleMemento(diameter);
    }
    public void restoreDiameter(CircleMemento memento) {
        diameter = memento.getSavedDiameter();
    }
}
