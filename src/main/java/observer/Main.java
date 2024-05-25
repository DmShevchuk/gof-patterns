package observer;

public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.changeState("New State");
    }
}
