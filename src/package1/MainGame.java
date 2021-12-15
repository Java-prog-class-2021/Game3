import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGame extends JFrame {

	//Hello World!
	//Hello its Ashwin!
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainGame();
			}
		});
	}
	
	
	DrawingPanel drPanel = new DrawingPanel();
	
	MainGame(){
		setupObjects();		
		setupJFrame("Example");
		this.add(drPanel);		 

		this.setVisible(true);		
        //timer1.start();
		
	}
	
	void setupObjects() {
		//	panel  = new DrawingPanel();
        //  etc
	}
	
	void setupJFrame(String title) {
		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	class DrawingPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			g.drawRect(100, 100, 100, 100);
		}
	}

}
