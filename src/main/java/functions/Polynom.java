package functions;

public class Polynom extends Function {
	private int exp;
	private Constant base;

	public Polynom(Constant base, int exp) {
		this.exp = exp;
		this.base = base;
	}
	
	public Polynom ableitung() {
		base = new Constant(base.getOperand()*exp);
		exp = exp-1;
		return new Polynom(base, exp);
	}
	
	public String print() {
		return ""+base.getOperand()+"x^"+exp;
	}
}
