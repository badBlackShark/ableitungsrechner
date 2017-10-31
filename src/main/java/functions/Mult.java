package functions;

public class Mult extends Function {
	private Function op1;
	private Function op2;

	public Mult(Function op1, Function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
}
