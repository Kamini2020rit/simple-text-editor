package note;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Note extends JFrame implements ActionListener
{
	JFrame f;       
	JTextArea a;    
	public Note()
	{
		f = new JFrame();
		a = new JTextArea();
		
		JMenuBar mb = new JMenuBar();
		
		JMenu jedit = new JMenu("Edit");
		
		JMenuItem jcut = new JMenuItem("Cut");
		JMenuItem jcopy = new JMenuItem("Copy");
		JMenuItem jpaste = new JMenuItem("Paste");
		
		jcut.addActionListener(this);
		jcopy.addActionListener(this);
		jpaste.addActionListener(this);
		
		jedit.add(jcut);
		jedit.add(jcopy);
		jedit.add(jpaste);
		
		mb.add(jedit);
		
		f.setJMenuBar(mb);
		f.add(a);
		f.setSize(500,500);
		f.setTitle("Notepad");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Cut"))
		{
			a.cut();	
		}
		else if(s.equals("Copy"))
		{
			a.copy();
		}
		else if(s.equals("Paste"))
		{
			a.paste();
		}
		
	}

	public static void main(String[] args) 
	{
	   Note n1 = new Note();
	}
}
