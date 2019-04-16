package search_engine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener 
{
	//Gui Components
   private JPanel 	panel;
   private JTextField textfield1; 
   String answer = "";
   Word_Search file1 = new Word_Search();
      
   GUI(String title)
   {
  
	   super(title);
	   setSize(300,130);
	   setLayout(new FlowLayout());
	   
	   // Textfield for the "word"
	   textfield1 = new JTextField("");
	   textfield1.setPreferredSize( new Dimension( 200, 24 ) );

	   textfield1.setToolTipText("Enter your word here");//Action listener for when word is entered in
	   textfield1.addActionListener(this);
	   add(textfield1);
	   
	   //Panel and Layout changes
	   panel = new JPanel(new FlowLayout());
	   panel.setBackground(Color.red);
	   JLabel label = new JLabel("Search Engine");
	   panel.add(label);
	   add(panel);

	   setVisible(true);
	
	}
   
@Override
public void actionPerformed(ActionEvent event) 
{
   if (event.getSource() == textfield1)
    	{
	   		try {
				answer = Word_Search.Search(textfield1.getText());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		try {
				JOptionPane.showMessageDialog(this, "You entered " + textfield1.getText() +"\n"+ answer);
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
    	}
}

}
