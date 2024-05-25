package visitor;

public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("ConcreteVisitor1 visiting ConcreteElementA");
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("ConcreteVisitor1 visiting ConcreteElementB");
        elementB.operationB();
    }
}
