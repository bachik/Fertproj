package org.brj;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Productpage extends  JFrame implements ActionListener{

	/**
	 * @param args
	 */
	JButton SEEDS,PESTICIDES,COTTON;
	 JPanel panel;
	Productpage()
	 {
		SEEDS=new JButton("SEEDS");
		SEEDS.setBounds(10, 10, 10, 10);
		PESTICIDES=new JButton("PESTICIDES");
		PESTICIDES.setBounds(40, 30, 80, 25);
		COTTON=new JButton("COTTON");
		COTTON.setBounds(40, 30, 80, 25);
		panel=new JPanel(new GridLayout(5,1));
		  panel.add(SEEDS);
		  panel.add(PESTICIDES);
		  panel.add(COTTON);
	     setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
	      setTitle("PRODUCT TYPE SELECTION");
	      add(panel,BorderLayout.CENTER);
	      SEEDS.addActionListener(this);
	      PESTICIDES.addActionListener(this);
	      COTTON.addActionListener(this);
	      setSize(400, 200);
	      setVisible(true);
	  }
	 public void actionPerformed(ActionEvent ae)
	  {
		 JButton o = (JButton) ae.getSource();
	  if (o.getText().equalsIgnoreCase("seeds")){
       Seedspage s=new Seedspage();
        s.setVisible(true);
        s.setSize(400, 300);
	  }
	  else if(o.getText().equalsIgnoreCase("cotton"))
	  {
		  System.out.println("cotton clicked");
	  }
	  else if(o.getText().equalsIgnoreCase("pesticides"))
	  {
		  System.out.println("pests clicked");
	  }
	  //NextPage page=new NextPage();
	  //page.setVisible(true);
	  //JLabel label = new JLabel("Welcome:"+value1);
	  //page.getContentPane().add(label);
	  else{
	  System.out.println("NOTHING SELECTED");
	  JOptionPane.showMessageDialog(this,"NOTHING SELECTED",
	  "Error",JOptionPane.ERROR_MESSAGE);
	  }
	}
}
