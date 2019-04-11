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
import java.io.IOException;


public class GUI extends JFrame implements ActionListener 
{

   /* attributes:
    note: it's good to set up the GUI components as class attributes , 
    instead of in the constructor so that they are visible/ usable in all method
   */	
   
   private JPanel 		panel;
   private JTextField 	tf1; 
   String answer = "";
   Word_Search file1 = new Word_Search();
      
   // constructor
   GUI(String title)
   {
  
	   super(title);
	   setSize(400,150);
	   setLayout(new FlowLayout());
	   
	   //GUI Components
	   tf1 = new JTextField("");
	   tf1.setPreferredSize( new Dimension( 300, 25 ) );

	   tf1.setToolTipText("Enter your word here");
	   tf1.addActionListener(this);

	   // add the GUI components to the frame
	   add(tf1);
	   
	   // adding panel (Part 5)
	   panel = new JPanel(new FlowLayout());
	   panel.setBackground(Color.red);
	   JLabel label = new JLabel("Java File Search Engine");
	   panel.add(label);
	   add(panel);

	   setVisible(true);
	
	}
   
@Override
public void actionPerformed(ActionEvent event) 
{
   if (event.getSource() == tf1)
    	{
	   		try {
				answer = Word_Search.Search(tf1.getText());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   		try {
				JOptionPane.showMessageDialog(this, "You entered " + tf1.getText() +"\n"+ answer);
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
    	}
}


//	JOptionPane.showMessageDialog(this, "Pressing on the frame");
	
}