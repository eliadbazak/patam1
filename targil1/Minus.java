package test;

public class Minus extends BinaryExpression {

    public Minus(Expression left, Expression right) {
        super(left, right);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculate() {
        return this.left.calculate() - this.right.calculate();
    }

}
