package test1;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.*;

public class adns1 extends Frame implements ActionListener {


		
		
		Button b1,b2,b3,b4;
		TextField t1,t2,t3;
		Label I1,I2,I3;
		public adns1()
		{
		I1=new Label("Enter a number");
		I2=new Label("Enter another number");
		I3=new Label("Solution");

		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t3.setEditable(false);

		b1=new Button("Add");
		b2=new Button("Substract");
		b3=new Button("Multiply");
		b4=new Button("Divide");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		setLayout(new FlowLayout());
		   	add(I1);
			add(I2);
			add(I3);
			add(t1);
			add(t2);	
			add(t3);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
		}
		public void actionPerformed(ActionEvent e)
		{
		double x,y,z;
		if(e.getSource()==b1)
		{
		x=Double.valueOf(t1.getText().trim()).doubleValue();
		y=Double.valueOf(t2.getText().trim()).doubleValue();
		z=x+y;
		t3.setText(String.valueOf(z));
		}

		else if(e.getSource()==b2)
		{
		x=Double.valueOf(t1.getText().trim()).doubleValue();
		y=Double.valueOf(t2.getText().trim()).doubleValue();
		z=x-y;
		t3.setText(String.valueOf(z));
		}
		else if(e.getSource()==b3)
		{

		x=Double.valueOf(t1.getText().trim()).doubleValue();
		y=Double.valueOf(t2.getText().trim()).doubleValue();
		z=x*y;
			t3.setText(String.valueOf(z));
		}
	else if(e.getSource()==b4)
		{

		x=Double.valueOf(t1.getText().trim()).doubleValue();
		y=Double.valueOf(t2.getText().trim()).doubleValue();
		z=x/y;
t3.setText(String.valueOf(z));
		}
		}
		public static void main(String[] ar){
		adns1 a1=new adns1();
		//a1.setSize(400,600);
		//a1.setVisible(true);
		a1.pack();
		a1.show();
		}
		
	}


