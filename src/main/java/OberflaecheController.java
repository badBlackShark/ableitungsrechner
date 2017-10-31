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
		
		textAusgeben(mult1.print());
		Ausgabefenster.appendText("\n");
		textAusgeben(pol1.print());
		
	}
	
	public void textAusgeben(String text) {
		Ausgabefenster.appendText(text);
	}
	
	
}


