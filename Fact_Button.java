import java.awt.*;
import java.awt.event.*;
public class Fact_Button extends Frame implements ActionListener
{
TextField t1,t2;
Label l1;
Button b1,b2;
public Fact_Button()
{
 setLayout(null);
 l1=new Label("Enter the no.:");
 add(l1);
 l1.setBounds(60,50,75,25);
 t1=new TextField();
 add(t1);
 t1.setBounds(175,50,50,25);
 b1=new Button("Factorial");
 add(b1);
 b1.setBounds(60,100,75,25);
 b1.addActionListener(this); b2=new Button("Exit");
 add(b2); 
 b2.setBounds(150,100,75,25);
 b2.addActionListener(this);
 t2=new TextField();
 add(t2);
 t2.setBounds(60,150,150,25);
 setSize(500,300);
 setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int x=Integer.parseInt(t1.getText());
int f=1;
for(int i=1;i<=x;i++) f*=i;
t2.setText("Factorial:"+f);
}
if(ae.getSource()==b2) System.exit(0);
}
public static void main(String ts7[])
{
Fact_Button fb=new Fact_Button();
}
}
