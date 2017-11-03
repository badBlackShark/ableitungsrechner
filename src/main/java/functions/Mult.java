package functions;

public class Mult extends Function {
	private Function op1;
	private Function op2;

	public Mult(Function op1, Function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public String toString() { return op1.toString() + "*" + op2.toString(); }
	
	public Plus ableiten() {
		//TODO op1, op2 kopieren
		return new Plus(new Mult(op1.ableiten(), op2) , new Mult(op1, op2.ableiten()));
	}
}
