import java.awt.*;
import java.awt.event.*;

public class ChoiceLists extends Frame
{
	Label lblTitle = new Label("Here is a choice list: ");
	Choice chlistStockSymbols=new Choice();
	
	public ChoiceLists()
	{
		super("ChoiceLists Example!");
		setLayout(new FlowLayout());

		chlistStockSymbols.addItem("QUE");
		chlistStockSymbols.addItem("MCP");
		chlistStockSymbols.addItem("SAMS");
		chlistStockSymbols.addItem("GOOD");
		
		add(lblTitle);
		add(chlistStockSymbols);
		setSize(300,100);
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
		ChoiceLists ChoiceListsApp=new ChoiceLists();
	}
}