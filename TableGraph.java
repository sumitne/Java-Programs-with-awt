import java.awt.*;
import java.applet.*;
public class TableGraph extends Applet
{
	int x[]={0,60,120,180,240,300,360,400};
	int y[]={400,280,220,140,60,60,100,220};
	int n=x.length;
	public void paint(Graphics g)
	{
		g.drawPolygon(x,y,n);
	}
}
