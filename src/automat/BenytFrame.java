package automat;

import javax.swing.JFrame;

public class BenytFrame
{
	public static void main(String[] arg)
	{
		JFrame vindue = new StartFrame();                               // Oprettelse af nyt start vindue
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);       // Vindue reagerer på luk
		vindue.setSize(800, 500);                                       // Sætter vinduets størrelse
		vindue.setVisible(true);                                        // åbner vinduet
	} // End of main
        
} // End of class Benyt Frame