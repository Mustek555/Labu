package tht;

public abstract class Component {
    void addGame(Component component) {
        throw new UnsupportedOperationException();
    };
    abstract void operation();
}
