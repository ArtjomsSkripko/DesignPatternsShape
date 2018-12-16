package shapes;

public interface Shape {
    void draw();
    void move(Integer x, Integer y);
    void enlarge(Integer times);
    void minimize(Integer times);
    void changeColor(String color);
}
