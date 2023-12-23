package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Visitable elementA = new ConcreteElementA();
        Visitable elementB = new ConcreteElementB();
        Visitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}

interface Visitable {
    void accept(Visitor visitor);
}

interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}

class ConcreteElementA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("ConcreteElementA operationA");
    }
}

class ConcreteElementB implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("ConcreteElementB operationB");
    }
}

class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        elementA.operationA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        elementB.operationB();
    }
}


