package shapes;

public class Triangle implements Shape {
    private Integer centerXCoord;
    private Integer centerYCoord;
    private Integer a;
    private Integer b;
    private Integer c;
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

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + getColor() + " triangle with center coordinates x: " +
                getCenterXCoord() + " and y: " + getCenterYCoord());
        System.out.println("Triangle side A: " + getA() +
                " side B: " + getB() + " side C: " + getC());
    }

    @Override
    public void move(Integer x, Integer y) {
        System.out.println("Moving triangle to new coordinates x: " +
                x + " and y: " + y);
        this.centerXCoord = x;
        this.centerYCoord = y;
    }

    @Override
    public void enlarge(Integer times) {
        this.a = a * times;
        this.b = b * times;
        this.c = c * times;
        System.out.println("Enlarging triangle by " + times + " times");
    }

    @Override
    public void minimize(Integer times) {
        this.a = a / times;
        this.b = b / times;
        this.c = c / times;
        System.out.println("Minimizing triangle by " + times + " times");
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
        System.out.println("Changing color of triangle to " + color);
    }
}
