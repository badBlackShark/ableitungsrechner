package functions;

public class Plus extends Function {
	private Function op1;
	private Function op2;

	public Plus(Function op1, Function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public String toString() { return "(" + op1.toString() + "+" + op2.toString() + ")" ; }
	
	public Plus ableiten() {
		
		return new Plus(op1.ableiten(), op2.ableiten());
	}
}
