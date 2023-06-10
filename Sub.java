package abstractionu2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Sub extends JFrame
{

	
	private JButton btn;
	private JTextField tf;
	private JCheckBox ch1;
	
	Sub()
	{
		super("hai...this is title");
		btn=new JButton("click me stupid ,i am button");
		add(btn);
		btn.setBackground(Color.orange);
		btn.setForeground(Color.blue);
		setLayout(new FlowLayout()); 
		tf=new JTextField("don't get confuse",25);
		add(tf);
		tf.setBackground(Color.pink);
		tf.setForeground(Color.black);
		ch1=new JCheckBox("are you okay");
		add(ch1);
		
		ch1.setForeground(Color.black);
		ch1.setBackground(Color.green);
		
		
		
		 altek s=new  altek();
		 btn.addActionListener(s);
		
		
		
		
	}//constructor close
	
	
	
	public class altek implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent y)
		{
			JOptionPane.showMessageDialog(null, "waste fellow ,click on ok....");
			btn.setBackground(Color.yellow);
			btn.setForeground(Color.RED);
			
		}
		
	}//class   altek close
	
	
	
}//class close
