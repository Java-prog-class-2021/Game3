import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainGame extends JFrame {
	

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainGame();
			}
		});
	}
	
	
	JPanel drpanel;
	
	MainGame(){
		setupObjects();		
		setupJFrame("Intersection of circle and line");
		this.add(drpanel);		 

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


}
