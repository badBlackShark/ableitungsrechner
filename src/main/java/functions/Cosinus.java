package functions;

public class Cosinus extends Function {
	private Function op1;

	public Cosinus(Function op1) {
		this.op1 = op1;
	}
	
	public String print() {
		
		return "cos(" + op1.print() + ")";
	}
	
	public Mult ableiten() {
		return new Mult(op1.ableiten(), new Mult(new Constant(-1), new Sinus(op1)));
	}
}
