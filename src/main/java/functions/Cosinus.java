package functions;

public class Cosinus extends Function {
	private Function op1;

	public Cosinus(Function op1) {
		this.op1 = op1;
	}
	
	public String print() {
		
		return "cos(" + op1.print() + ")";
	}
}
