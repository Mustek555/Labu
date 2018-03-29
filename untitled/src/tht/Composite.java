package tht;

import java.util.ArrayList;

public class Composite extends Component{
    private ArrayList<Component> game = new ArrayList<>();

    @Override
    void addGame(Component component) {
        game.add(component);
    }

    @Override
    void operation() {
        System.out.println("Operation in object " + this);
        for (Component component : game) {
            component.operation();
        }
    }
}
