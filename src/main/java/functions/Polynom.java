package functions;

public class Polynom extends Function {
	private int exp;
	private Function base;

	public Polynom(Function base, int exp) {
		this.exp = exp;
		this.base = base;
	}
	
	public Mult ableiten() {
		return new Mult(new Constant(exp), new Polynom(base, exp-1));
	}
	
	public String print() {
		return ""+base.print()+"x^"+exp;
	}
}
