import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample extends Frame
{
	GridLayout layout=new GridLayout(2,3);
	//GridLayout layout=new GridLayout(3,2);

	Button btnOne = new Button("One");
	Button btnTwo = new Button("Two");
	Button btnThree = new Button("Three");
	Button btnFour = new Button("Four");
	Button btnFive = new Button("Five");
	Button btnSix = new Button("Six");
	
	public GridLayoutExample()
	{
		super("GridLayout Example!");
		setLayout(layout);
		add(btnOne);
		add(btnTwo);
		add(btnThree);
		add(btnFour);
		add(btnFive);
		add(btnSix);
		setSize(200,100);
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
		GridLayoutExample GridlayoutApp=new GridLayoutExample();
	}
}