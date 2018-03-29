package tht;

public class Main {
    public static void main(String[] args) {
        Component component = new Composite();
        component.addGame(new Leaf());
        Component component2 = new Composite();
        component2.addGame(component);
        User user = new User(component2);
    }
}
