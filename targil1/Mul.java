package test;

public class Mul extends BinaryExpression {

    public Mul(Expression left, Expression right) {
        super(left, right);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculate() {
        return this.left.calculate() * this.right.calculate();
    }
}
