import java.awt.*;
import java.awt.event.*;

public class TextAreas extends Frame
{
	Label lblDescription = new Label("Enter a description");
	TextArea txtDescription=new TextArea (15,80);
	
	public TextAreas()
	{
		super("TextAreas Example!");
		setLayout(new FlowLayout());
		add(lblDescription);
		add(txtDescription);
		
		setSize(640,320);
		setVisible(true);
		addWindowListener
		(
			new WindowAdapter()
			{
				public void windowClosing (WindowEvent e)
				{
					System.exit(0);
				}
			}
		);
	}
	public static void main(String [] args)
	{
		TextAreas TextAreasApp=new TextAreas();
	}
}