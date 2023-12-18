package behavioral.interpreter;

public class Main {

    public static void main(String[] args) {
        Expression expression = new AdditionExpression(
                new SubtractionExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(1)
        );

        System.out.println("Result: " + expression.interpret());
    }
}

// AbstractExpression
interface Expression {
    int interpret();
}

// TerminalExpression
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

// NonterminalExpression
class AdditionExpression implements Expression {
    private Expression left;
    private Expression right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

class SubtractionExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

