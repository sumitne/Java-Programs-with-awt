import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample extends Frame implements ActionListener
{
	CardLayout layout=new CardLayout();


	Button btnOne = new Button("One");
	Button btnTwo = new Button("Two");
	Button btnThree = new Button("Three");
	Button btnFour = new Button("Four");

	
	public CardLayoutExample()
	{
		super("CardLayout Example!");
		setLayout(layout);
		
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);

		add("Card 1", btnOne);
		add("Card 2", btnTwo);
		add("Card 3", btnThree);
		add("Card 4", btnFour);

		layout.first(this);

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
	
	public void actionPerformed(ActionEvent evt)
	{
		Object objSource=evt.getSource();
		if(objSource==btnOne ||
		   objSource==btnTwo ||
		   objSource==btnThree ||
		   objSource==btnFour)
		{
			layout.next(this);
		}
	}
	public static void main(String [] args)
	{
		CardLayoutExample CardLayoutApp=new CardLayoutExample();
	}
}