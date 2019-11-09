import java.awt.*; 
import java.applet.*; 
public class Face extends Applet 
{
    public void init()
    {
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    public void paint(Graphics g)
    {
        g.drawOval(80,70,150,150);
        g.setColor(Color.RED);
        g.drawOval(120,120,15,15);
        g.fillOval(120,120,15,15);
        g.drawOval(170,120,15,15);
        g.fillOval(170,120,15,15);
        g.drawOval(147,155,12,12);
        g.drawArc(130,180,50,20,180,180);
    }
}
