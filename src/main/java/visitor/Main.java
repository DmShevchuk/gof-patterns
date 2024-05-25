package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());

        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        System.out.println("Using ConcreteVisitor1:");
        for (Element element : elements) {
            element.accept(visitor1);
        }

        System.out.println("\nUsing ConcreteVisitor2:");
        for (Element element : elements) {
            element.accept(visitor2);
        }
    }
}
