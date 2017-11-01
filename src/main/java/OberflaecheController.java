import java.util.ResourceBundle;

import functions.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class OberflaecheController implements Initializable{

	@FXML private Button EingabeButton;
	@FXML private TextField EingabeFeld;
	@FXML private TextArea Ausgabefenster;

	@Override
	public void initialize(java.net.URL location, ResourceBundle resources) {
		//create Nodes
		Node <Function> left = new Node<Function>(new Constant(3));
		Node <Function> right = new Node<Function>(new Constant(4));
		Node <Function> root = new Node<Function>(new Mult(left.data, right.data));

		//create Tree
		root.left = left;
		root.right = right;

		//print tree
		BTreePrinter.printNode(root);

		Function mult1 = new Mult(new Constant(3), new Constant(4));

		Function pol1 = new Polynom(new Constant(3), 2);
		Function polAbl = pol1.ableiten();
		

		textAusgeben(mult1.print());
		Ausgabefenster.appendText("\n");
		textAusgeben(pol1.print());
		Ausgabefenster.appendText("\n");
		textAusgeben(polAbl.print());

		Function exp1 = new Exp(new Constant(5));
		Function add1 = new Plus(exp1, new Cosinus(new Constant(2)));
		Function mult2 = new Mult(add1, mult1);
		Ausgabefenster.appendText("\n");

		textAusgeben(mult2.print());
		Function mult2Abl = mult2.ableiten();
		Ausgabefenster.appendText("\n");
		textAusgeben(mult2Abl.print());
		
		Ausgabefenster.appendText("\n");
		Function exp2 = new Exp(new Polynom(new Plus(new Polynom(new Constant(3),1),new Constant(4)), 3));
		textAusgeben(exp2.print());
		Ausgabefenster.appendText("\n");
		textAusgeben(exp2.ableiten().print());


	}

	public void textAusgeben(String text) {
		Ausgabefenster.appendText(text);
	}


}
