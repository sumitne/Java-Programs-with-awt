import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample extends Frame
{
	FlowLayout layout=new FlowLayout(FlowLayout.CENTER);

	Label lblOne = new Label("One");
	Label lblTwo = new Label("Two");
	Label lblThree = new Label("Three");
	Label lblFour = new Label("Four");
	Label lblFive = new Label("Five");
	Label lblSix = new Label("Six");
	
	public FlowLayoutExample()
	{
		super("FlowLayout Example!");
		setLayout(layout);
		add(lblOne);
		add(lblTwo);
		add(lblThree);
		add(lblFour);
		add(lblFive);
		add(lblSix);
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
		FlowLayoutExample FlowlayoutApp=new FlowLayoutExample();
	}
}