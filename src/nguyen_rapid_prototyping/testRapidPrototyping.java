package nguyen_rapid_prototyping;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class testRapidPrototyping 
{

	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{		
		
		//array for comboBox(s)
		String[] lineThick = {"1x", "2x", "3x"};
		String[] color = {"Black", "Blue", "Green", "Red"};
		
		// TODO Auto-generated method stub		
		JFrame frame = new JFrame("Ethan's Painting");
		 
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        JLabel line = new JLabel("Set Line Thickness");
        JLabel colorLab = new JLabel("Set Color");
        //Buttons 
        JButton recButton = new JButton();
        recButton.setText("Rectangle");
        
        JButton linButton = new JButton();
        linButton.setText("Line");
        
        JButton cirButton = new JButton();
        cirButton.setText("Eclipse");
        
        JButton clrButton = new JButton();
        clrButton.setText("Clear");
        
        //combo boxes
       
		JComboBox linSize = new JComboBox(lineThick);
        linSize.setSelectedIndex(2);
        JComboBox colors = new JComboBox(color);
        colors.setSelectedIndex(3);
        
        
        //add to panel
        
        panel.add(recButton);
        panel.add(linButton);
        panel.add(cirButton);
        
        panel.add(clrButton);
        panel.add(line);
        panel.add(linSize);
        panel.add(colorLab);
        panel.add(colors);
        //panel.add(colors, BorderLayout.SOUTH);
 
       
         
         
        //add to frame
        
        frame.add(panel, BorderLayout.NORTH);        
        frame.setSize(700, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}	
	
	
	public int getX(MouseEvent e) 
	{
	       return e.getX();	        
	}
	
	public int getY(MouseEvent e) 
	{
	       return e.getY();	        
	}
	
	public void paint (Graphics g)
	{
		g.fillRect(0, 12, 30, 40);
	}
}
