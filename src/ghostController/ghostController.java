package ghostController;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import ghostModel.Ghost;

import javax.swing.ImageIcon;

public class ghostController
{
	private Ghost Boo;
	private Ghost Greenie;
	private Ghost KingBoo;
	
	private Ghost[] ghostArray;
	private ImageIcon [] icons;
	
	public ghostController()
	{
		icons = new ImageIcon[3];
		
		icons[0] = new ImageIcon(getClass().getResource("/ghost/view/ghost.view.images/kingBoo.png"));
		icons[1] = new ImageIcon(getClass().getResource("/ghost/view/ghost.view.images/boolean.jpg"));
		icons[2] = new ImageIcon(getClass().getResource("/ghost/view/ghost.view.images/greenie.jpeg"));
		
		
		Boo = new Ghost();
		Greenie = new Ghost("Greenie", "Green", 4, 30);
		KingBoo = new Ghost("King Boo", "White", 6, 500);
	}

	
	public void start()
	{
		
	}
}
