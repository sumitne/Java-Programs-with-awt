import java.awt.*;
import java.awt.event.*;

public class Labels extends Frame
{
	Label lblTitle = new Label("Here are a couple lebels: ");
	Label lblStockSymbol=new Label ("QUE");
	Label lblStockPrice=new Label("150.5");
	public Labels()
	{
		super("Labels Example!");
		setLayout(new FlowLayout());
		add(lblTitle);
		add(lblStockSymbol);
		add(lblStockPrice);
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
		Labels LabelsApp=new Labels();
	}
}