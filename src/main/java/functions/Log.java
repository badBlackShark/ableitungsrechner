package functions;

public class Log extends Function {
	private Function op1;

	public Log(Function op1) {
		this.op1 = op1;
	}
	
	public String toString() { return "ln(" + op1.toString() + ")"; }
	
	public Mult ableiten() {
		
		return new Mult(op1.ableiten(), new Polynom(op1, -1));
	}
}
