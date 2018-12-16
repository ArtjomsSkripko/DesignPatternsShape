package iterator;

import java.util.Arrays;
import java.util.List;

import builders.CircleBuilder;
import builders.OvalBuilder;
import builders.RectangleBuilder;
import builders.TriangleBuilder;
import shapes.Shape;

public class ShapeRepository implements Aggregate {

    private List<Shape> shapes = Arrays.asList(new CircleBuilder().withDefaults().build(),
            new TriangleBuilder().withDefaults().build(),
            new RectangleBuilder().withDefaults().build(),
            new OvalBuilder().withDefaults().build(),
            new CircleBuilder().withDefaults().color("PURPLE").diameter(40).build());

    @Override
    public Iterator getIterator() {
        return new ShapeCreatorIterator();
    }

    private class ShapeCreatorIterator implements Iterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < shapes.size();
        }

        @Override
        public Object next() {
            return shapes.get(index++);
        }
    }

}
