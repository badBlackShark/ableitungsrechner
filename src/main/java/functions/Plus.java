package functions;

public class Plus extends Function {
	private Function op1;
	private Function op2;

	public Plus(Function op1, Function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public String print() {
		
		return "(" + op1.print() + "+" + op2.print() + ")" ;
	}
}
