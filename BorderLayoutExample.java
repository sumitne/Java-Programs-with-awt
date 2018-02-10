import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends Frame
{
	BorderLayout layout=new BorderLayout(5,5);


	Button btnNorth = new Button("North");
	Button btnSouth = new Button("South");
	Button btnEast = new Button("East");
	Button btnWest = new Button("West");
	Button btnCenter = new Button("Center");

	
	public BorderLayoutExample()
	{
		super("BorderLayout Example!");
		setLayout(layout);
		add(btnNorth, BorderLayout.NORTH);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnEast, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		add(btnCenter, BorderLayout.CENTER);
		
		setSize(320,240);
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
		BorderLayoutExample BorderlayoutApp=new BorderLayoutExample();
	}
}