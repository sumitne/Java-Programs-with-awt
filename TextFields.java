import java.awt.*;
import java.awt.event.*;

public class TextFields extends Frame
{
	Label lblSymbol = new Label("Enter your stock Symbol: ");
	TextField txtStockSymbol=new TextField(5);
	Label lblQuantity=new Label("How many shares do you own?");
	TextField txtNumberOfShares=new TextField("0", 10);
	public TextFields()
	{
		super("TextFields Example!");
		setLayout(new FlowLayout());
		add(lblSymbol);
		add(txtStockSymbol);
		add(lblQuantity);
		add(txtNumberOfShares);
		setSize(400,100);
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
		TextFields TextFieldsApp=new TextFields();
	}
}