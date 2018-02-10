import java.awt.*;
import java.awt.event.*;

public class Buttons extends Frame
{
	Label lblTitle = new Label("Here is a Button: ");
	Button btnUpdate=new Button ("Update Quotes");
	
	public Buttons()
	{
		super("Buttons Example!");
		setLayout(new FlowLayout());
		add(lblTitle);
		add(btnUpdate);
		
		setSize(300,60);
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
		Buttons ButtonsApp=new Buttons();
	}
}