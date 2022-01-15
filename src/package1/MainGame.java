


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class MainGame extends JFrame implements MouseListener, MouseMotionListener, ActionListener{
	int mouseX, mouseY;
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainGame();
			}
		});
	}


	DrawingPanel drPanel = new DrawingPanel();

	ArrayList<Bullets> bulletList = new ArrayList<Bullets>();


	Character player = new Character(985,500,30,50);
	Map map = new Map(-10,-10,2000,1200);
	MainGame(){
		setupObjects();
		moveLasers();

		setupJFrame("Example");
		this.add(drPanel);		 

		drPanel.addMouseListener(this);
		drPanel.addMouseMotionListener(this);

		Timer timer = new Timer(10,this);
		timer.start();

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

	@Override
	public void actionPerformed(ActionEvent e) {
		moveLasers();
		drPanel.repaint();		
	}


	class DrawingPanel extends JPanel {
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g); 
			g.fillRect(mouseX-10, mouseY, 7, 3); 
			g.fillRect(mouseX+7, mouseY, 7, 3);
			g.fillRect(mouseX, mouseY+7, 3, 7);
			g.fillRect(mouseX, mouseY-10, 3, 7);
			map.paint(g);
			player.paint(g);
			for(Bullets z : bulletList) {				
				g.fillOval(z.x, z.y, z.width, z.height);
			}
		}
	}
	class Key implements KeyListener{



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

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}
	long lastShot = 0;
	void shoot() {
		if (bulletList.size() >= Bullets.MAXBULLETS) return;

		long now = System.currentTimeMillis();
		long elapsed = now - lastShot;
		if (elapsed < Bullets.SHOTDELAY) return;

		lastShot = now;
		Bullets bullet = new Bullets(500, 500);
		bulletList.add(bullet);
	}

	void moveLasers() {
		for (Bullets z : bulletList) {
			z.y -= z.speed;
		}

		for(Bullets z : bulletList) {
			if (z.y < 0) bulletList.remove(z);
			break;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		drPanel.repaint();
		this.setTitle(mouseX + ", " + mouseY);
	}

	@Override

	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		drPanel.repaint();
		this.setTitle(mouseX + ", " + mouseY);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		shoot();
		drPanel.repaint();
	}


	@Override
	public void mousePressed(MouseEvent e) {
		shoot();
		moveLasers();
		drPanel.repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}

