package memento;

public class CircleMemento {

    private final Integer diameter;

    public CircleMemento(Integer d) {
        diameter = d;
    }
    public Integer getSavedDiameter() {
        return diameter;
    }
}
