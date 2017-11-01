package functions;

public class Exp extends Function {
	private Function op1;

	public Exp(Function op1) {
		this.op1 = op1;
	}

	public String print() {

		return "exp(" + op1.print() + ")";
	}
	
	public Mult ableiten() {
		return new Mult(op1.ableiten(), new Exp(op1));
	}
}
