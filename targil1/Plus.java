package test;

public class Plus extends BinaryExpression {

    public Plus(Expression left, Expression right) {
        super(left, right);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculate() {
        return this.left.calculate() + this.right.calculate();
    }


}
