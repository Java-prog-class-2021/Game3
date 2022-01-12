import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
	Character player = new Character(985,500,30,50);
	Map map = new Map(-10,-10,2000,1200);
	
	
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
		this.addKeyListener(new Key());
	}

	class DrawingPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			g.drawRect(100, 100, 100, 100);
			map.paint(g);
			player.paint(g);
		}
	}
	class Key implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_W) {
				map.pMoveUp(player);
				drPanel.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_A) {
				map.pMoveLeft(player);
				drPanel.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_D) {
				map.pMoveRight(player);
				drPanel.repaint();
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				map.pMoveDown(player);
				drPanel.repaint();
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
