package functions;

public class Mult extends function {
	private function op1;
	private function op2;

	public Mult(function op1, function op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
}
