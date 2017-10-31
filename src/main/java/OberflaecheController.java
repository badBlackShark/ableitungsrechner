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
		Node <function> left = new Node<function>(new Constant(3));
		Node <function> right = new Node<function>(new Constant(4));
		Node <function> root = new Node<function>(new Mult(left.data, right.data));
		
		//create Tree
		root.left = left;
		root.right = right;
		
		//print tree
		BTreePrinter.printNode(root);
		
	}
	
	public void textAusgeben(String text) {
		Ausgabefenster.appendText(text);
	}
	
	
}


