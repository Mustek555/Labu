package tht;

public class User {
    public User(Component component) {
        System.out.println("Constructor in object " + this);
        component.operation();
    }
}
