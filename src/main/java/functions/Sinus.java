package functions;

public class Sinus extends Function {
	private Function op1;

	public Sinus(Function op1) {
		this.op1 = op1;
	}
	
	public String toString() { return "sin(" + op1.toString() + ")"; }
	
	public Mult ableiten() {
		return new Mult(op1.ableiten(), new Cosinus(op1));
	}
}
