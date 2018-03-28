package automat;

//import automat.AutomatGUI;
import javax.swing.JFrame;

public class BenytGUI
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "BILLETAUTOMAT");
                                            
                vindue.add( new StartPanel() );
                
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
		vindue.setSize(640, 480);// sæt vinduets størrelse
		vindue.setVisible(true);                      // åbn vinduet
	}
}