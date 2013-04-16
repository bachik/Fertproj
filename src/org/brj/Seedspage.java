package org.brj;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Seedspage extends JFrame implements  ActionListener {
	 JButton Cost,SUBMIT;
	 JPanel panel;
	 JLabel label1,label2,label3,label4;
	 final JTextField  text1,text2,text3;
	 private Connection con;
	    private Statement stmt;
	    private ResultSet rs;
	 public Seedspage()
	 {
		 try
	        {
	        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","shashi","root");
	        stmt=con.createStatement();
	        }
	        catch(Exception e)
	        {
	        	 JOptionPane.showMessageDialog(null, e.getMessage());
	        }
		  label1 = new JLabel();
		  label1.setText("PRODUCT NAME:");
		  label2 = new JLabel();
		  label2.setText("COST:");
		  label3 = new JLabel();
		  label3.setText("Quantity:");
		  text1 = new JTextField(15);
		  text2 = new JTextField(15);
		  text3 = new JTextField(15);
		  SUBMIT=new JButton("Submit");
		  Cost=new JButton("SHOW COST");
		  panel=new JPanel(new GridLayout(5,1));
		  panel.add(label1);
		  panel.add(new Autoexntender());
		  panel.add(Cost);
		  panel.add(label2);
		  panel.add(text2);
		  panel.add(label3);
		  panel.add(SUBMIT); 
		  add(panel,BorderLayout.CENTER);
		  Cost.addActionListener(this);
		  SUBMIT.addActionListener(this);
		 
	 }
	 
	@Override
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		JButton o = (JButton)ae.getSource();
		  if (o.getText().equalsIgnoreCase("SHOW COST")){
			  try{
			       // rs=stmt.executeQuery("select price from seeds where");
			         // while(rs.next()){
			                 
			          }
			        catch(Exception e)
			        {
			        	 JOptionPane.showMessageDialog(null, e.getMessage());
			        }
		  }

		
	}

}
