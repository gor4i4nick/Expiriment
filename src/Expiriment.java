import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Expiriment extends JFrame {
	private JTextField textField;
	public Expiriment() {
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
	}

}
