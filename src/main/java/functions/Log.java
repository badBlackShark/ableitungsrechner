package functions;

public class Log extends Function {
	private Function op1;

	public Log(Function op1) {
		this.op1 = op1;
	}
	
	public String print() {
		
		return "ln(" + op1.print() + ")";
	}
}
