package shapes;

public class Oval implements Shape {
    private Integer centerXCoord;
    private Integer centerYCoord;
    private Integer diameter1;
    private Integer diameter2;
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

    public Integer getDiameter1() {
        return diameter1;
    }

    public void setDiameter1(Integer diameter1) {
        this.diameter1 = diameter1;
    }

    public Integer getDiameter2() {
        return diameter2;
    }

    public void setDiameter2(Integer diameter2) {
        this.diameter2 = diameter2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " oval with center coordinates x: " +
                getCenterXCoord() + " and y: " + getCenterYCoord() + " with diameters: " + getDiameter1() +
                " and " + getDiameter2());
    }

    @Override
    public void move(Integer x, Integer y) {
        this.centerXCoord = x;
        this.centerYCoord = y;
        System.out.println("Moving oval to new coordinates x: " +
                x + " and y: " + y);
    }

    @Override
    public void enlarge(Integer times) {
        this.diameter1 = diameter1 * times;
        this.diameter2 = diameter2 * times;
        System.out.println("Enlarging oval by " + times + " times");
    }

    @Override
    public void minimize(Integer times) {
        this.diameter1 = diameter1 / times;
        this.diameter2 = diameter2 / times;
        System.out.println("Minimizing oval by " + times + " times");
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changing color of oval to " + color);
    }
}
