package functions;

public class Constant extends Function {
	private int op1;

	public Constant(int exp) {
		this.op1 = exp;
	}

	public int getOperand() {
		return op1;
	}

	public String print() {
		return Integer.toString(op1);
	}
	
	public Constant ableiten() {
		return new Constant(0);
	}
}
