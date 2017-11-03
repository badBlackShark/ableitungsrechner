package functions;

public abstract class Function {

	public abstract String toString();

	public abstract Function ableiten();

	public void print() { System.out.println(this.toString()); }

	//TODO vereinfachen
}
