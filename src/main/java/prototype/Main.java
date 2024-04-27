package prototype;

public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("John", 30);

        Prototype clone1 = prototype.clone();
        Prototype clone2 = prototype.clone();

        System.out.println("Original: " + prototype);
        System.out.println("Clone 1: " + clone1);
        System.out.println("Clone 2: " + clone2);
    }
}
