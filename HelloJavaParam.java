import java.awt.*;
import java.applet.Applet;
public class HelloJavaParam extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("string");
		if (str==null)
			str="Java";
			str="Hello "+str;
	}
	public void paint (Graphics g)
	{
		g.drawString(str,20,200);
	}
}

