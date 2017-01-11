package hipster.view;

import javax.swing.JFrame;
import hipster.controller.hipsterController;
import java.awt.Dimension;


public class hipsterFrame extends JFrame
{
	private hipsterController baseController;
	private hipsterPanel appPanel;
	
	public hipsterFrame(hipsterController baseController)
	{
		this.baseController = baseController;
		this.appPanel = new hipsterPanel(baseController);
		
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("HipsterWindow.exe");
		this.setSize(new Dimension(600, 400));
		this.setResizable(false);
		this.setVisible(true);
	}
}
