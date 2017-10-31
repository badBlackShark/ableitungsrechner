package functions;

public class Minus extends Function{

	private Function op1;
	private Function op2;

	public Minus(Function op1, Function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
}
