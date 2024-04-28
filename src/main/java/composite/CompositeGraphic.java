package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private final List<Graphic> components = new ArrayList<>();

    public void add(Graphic graphic) {
        components.add(graphic);
    }

    public void remove(Graphic graphic) {
        components.remove(graphic);
    }

    @Override
    public void draw() {
        for (Graphic component : components) {
            component.draw();
        }
    }
}
