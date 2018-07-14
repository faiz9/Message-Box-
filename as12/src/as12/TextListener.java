package as12;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.TextArea;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class TextListener extends JPanel 
			implements NewTextListener {

	/**
	 * Create the panel.
	 */
	private JTextArea textArea;
	public TextListener() {
		setForeground(Color.YELLOW);
		
		textArea = new JTextArea();
		textArea.setColumns(30);
		textArea.setRows(10);
		add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		add(scrollBar);
		
	}

	@Override
	public void newTextEntered(NewTextEvent ev) {
		
		String message = ev.getNewText();
		textArea.append(message+"\n");	
	}
	public void setSource (TextSource ts) {
		ts.addNewTextListener(this);
	}

}
