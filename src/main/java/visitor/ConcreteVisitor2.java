package visitor;

public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor2 visiting ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor2 visiting ConcreteElementB");
        elementB.operationB();
    }
}