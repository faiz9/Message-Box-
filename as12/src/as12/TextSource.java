package as12;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextSource extends JPanel {
	private JTextField jtfNewText;
	private NewTextListener ntl;
	
 	/**
	 * Create the panel.
	 */
	public TextSource() {
		setForeground(Color.GREEN);
		
		JLabel lblEnterText = new JLabel("Enter Text");
		add(lblEnterText);
		
		jtfNewText = new JTextField();
		jtfNewText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newText = jtfNewText.getText();
				fireNewTextEntered(newText);
			}
		});
		add(jtfNewText);
		jtfNewText.setColumns(20);

	}
	public void addNewTextListener(NewTextListener ntl) {
		this.ntl = ntl;
		}
	public void fireNewTextEntered (String newText) {
		NewTextEvent ntev = new NewTextEvent(newText);
		ntl.newTextEntered(ntev);
	}
}