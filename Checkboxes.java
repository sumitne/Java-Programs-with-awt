import java.awt.*;
import java.awt.event.*;

public class Checkboxes extends Frame
{
	Label lblTitle = new Label("Here are some checkboxes: ");
	Checkbox cbxHistoricalTracking=new Checkbox("Historical Tracking");
	Checkbox cbxAddToPortfolio=new Checkbox("Add to Portfolio",true);
	CheckboxGroup cbgOrderOption=new CheckboxGroup();
	Checkbox cbxBuy=new Checkbox("Buy", cbgOrderOption, true);
	Checkbox cbxSell=new Checkbox("Sell",cbgOrderOption,false);
	Checkbox cbxHold=new Checkbox("Hold",cbgOrderOption,false);
	public Checkboxes()
	{
		super("Checkboxes Example!");
		setLayout(new FlowLayout());
		add(lblTitle);
		add(cbxHistoricalTracking);
		add(cbxAddToPortfolio);
		add(cbxBuy);
		add(cbxSell);
		add(cbxHold);
		setSize(300,120);
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
		Checkboxes CheckboxesApp=new Checkboxes();
	}
}