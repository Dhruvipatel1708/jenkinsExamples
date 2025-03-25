import java.applet.*;
import java.awt.*;
/*<applet code ="AppletDemo1.class"width="300" height="300">
</applet>*/
public class AppletDemo1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello World!",100,150);
		g.drawLine(150,300,250,300);
		g.drawLine(175,350,175,550);
		g.setColor(Color.GRAY);
		g.fillRect(200,400,100,150);
		g.setColor(Color.BLUE);
		g.fillOval(300,350,200,200);
	}
}
