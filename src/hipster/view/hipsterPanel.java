package hipster.view;

import javax.swing.*;
import hipster.controller.hipsterController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class hipsterPanel extends JPanel
{
	
	private SpringLayout baseLayout;
	private JComboBox dropDown;
	private JLabel infoLabel;
	private JButton myButton;
	private hipsterController baseController;
	
	public hipsterPanel(hipsterController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("Click the button");
		
		this.infoLabel = new JLabel("wow words!");
		
		
		this.dropDown = new JComboBox(baseController.getWords());
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 0, SpringLayout.WEST, infoLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 115, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, myButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 150, SpringLayout.WEST, this);
		infoLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				infoLabel.setText(dropDown.getSelectedItem().toString());
			}
		});
		
	}
}
