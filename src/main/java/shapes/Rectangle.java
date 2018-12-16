package shapes;

public class Rectangle implements Shape {
    private Integer centerXCoord;
    private Integer centerYCoord;
    private Integer length;
    private Integer width;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " rectangle with center coordinates x: " +
                getCenterXCoord() + " and y: " + getCenterYCoord());
        System.out.println("Rectangle length: " + getLength() +
                " width: " + getWidth());
    }

    @Override
    public void move(Integer x, Integer y) {
        System.out.println("Moving rectangle to new coordinates x: " +
                x + " and y: " + y);
        this.centerXCoord = x;
        this.centerYCoord = y;
    }

    @Override
    public void enlarge(Integer times) {
        this.length = length * times;
        this.width = width * times;
        System.out.println("Enlarging rectangle by " + times + " times");
    }

    @Override
    public void minimize(Integer times) {
        this.length = length / times;
        this.width = width / times;
        System.out.println("Minimizing rectangle by " + times + " times");
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changing color of rectangle to " + color);
    }
}
