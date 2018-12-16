package builders;

import shapes.Oval;

public class OvalBuilder {
    private Oval oval;

    public OvalBuilder() {
        this.oval = new Oval();
    }

    public OvalBuilder centerXCoord(Integer x) {
        oval.setCenterXCoord(x);
        return this;
    }

    public OvalBuilder centerYCoord(Integer y) {
        oval.setCenterYCoord(y);
        return this;
    }

    public OvalBuilder diameter1(Integer diameter1) {
        oval.setDiameter1(diameter1);
        return this;
    }

    public OvalBuilder diameter2(Integer diameter2) {
        oval.setDiameter2(diameter2);
        return this;
    }

    public OvalBuilder color(String color) {
        oval.setColor(color);
        return this;
    }


    public OvalBuilder withDefaults() {
        return this
                .color("ORANGE")
                .diameter1(10)
                .diameter2(5)
                .centerXCoord(0)
                .centerYCoord(0);
    }

    public Oval build() {
        return oval;
    }

}
