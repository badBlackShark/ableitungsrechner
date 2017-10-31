package functions;

public class Constant extends Function {
	private int op1;

	public Constant(int op1) {
		this.op1 = op1;
	}

	public int getOperand() {
		return op1;
	}

	public String print() {
		return Integer.toString(op1);
	}
}
