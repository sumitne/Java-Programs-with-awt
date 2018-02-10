import java.awt.*;
import java.awt.event.*;

public class GridBagLayoutExample extends Frame
{
	GridBagLayout layout=new GridBagLayout();
	GridBagConstraints constraints=new GridBagConstraints();

	Button btnOne = new Button("One");
	Button btnTwo = new Button("Two");
	Button btnThree = new Button("Three");
	Button btnFour = new Button("Four");
	Button btnFive = new Button("Five");
	Button btnSix = new Button("Six");
	Button btnSeven = new Button("Seven");
	Button btnEight = new Button("Eight");
	Button btnNine = new Button("Nine");
	Button btnTen = new Button("Ten");
	
	public GridBagLayoutExample()
	{
		super("GridBagLayout Example!");
		setLayout(layout);
		
		constraints.fill=GridBagConstraints.BOTH;

		add(btnOne);
		add(btnTwo);

		constraints.weightx=1.0;
		layout.setConstraints(btnOne, constraints);
		layout.setConstraints(btnTwo, constraints);
		
		add(btnThree);

		constraints.gridwidth=GridBagConstraints.REMAINDER;
		layout.setConstraints(btnThree, constraints);

		add(btnFour);
		
		constraints.gridwidth=2;
		constraints.gridheight=2;
		constraints.weighty=1.0;
		layout.setConstraints(btnFour, constraints);

		add(btnFive);

		constraints.gridwidth=GridBagConstraints.REMAINDER;
		layout.setConstraints(btnFive, constraints);
		constraints.weighty=0;

		add(btnSix);

		constraints.gridwidth=GridBagConstraints.REMAINDER;
		layout.setConstraints(btnSix, constraints);

		add(btnSeven);
		add(btnEight);
		add(btnNine);

		constraints.gridwidth=1;
		constraints.weighty=2.0;
		layout.setConstraints(btnSeven, constraints);
		layout.setConstraints(btnEight, constraints);
		layout.setConstraints(btnNine, constraints);

		add(btnTen);
		
		constraints.gridwidth=GridBagConstraints.REMAINDER;
		layout.setConstraints(btnTen, constraints);

		setSize(320,180);
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
		GridBagLayoutExample GridBagLayoutApp=new GridBagLayoutExample();
	}
}