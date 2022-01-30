

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class MainGame extends JFrame implements MouseListener, MouseMotionListener, ActionListener{

	int mouseX, mouseY;
	int mClicked=0;


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
	int panW, panH;//TODO

	Character player = new Character(985,340,30,50);
	House house = new House();

	MainGame(){
		setupObjects();
		moveBullets();

		setupJFrame("Example");
		this.add(drPanel);	
		panW = drPanel.getWidth();
		panH = drPanel.getHeight();

		drPanel.addMouseListener(this);
		drPanel.addMouseMotionListener(this);

		Timer timer = new Timer(10,this);
		timer.start();

		this.setVisible(true);	
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
		moveBullets();
		drPanel.repaint();		
	}


	class DrawingPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			//grass
			super.paintComponent(g); //clear and set BGcolor
			setBackground(Color.decode("#48c33a"));
			((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			house.paint(g);
			player.paint(g);

			for(Bullets z : bulletList) {				
				z.paint(g);
			}

			g.fillRect(mouseX-10, mouseY, 7, 3); //draws crosshair
			g.fillRect(mouseX+7, mouseY, 7, 3);
			g.fillRect(mouseX, mouseY+7, 3, 7);
			g.fillRect(mouseX, mouseY-10, 3, 7);


		}
	}

	class Key implements KeyListener{
		boolean left,right,up,down;
		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_A) left = false;
			if (e.getKeyCode() == KeyEvent.VK_D) right = false;
			if (e.getKeyCode() == KeyEvent.VK_W) up = false;
			if (e.getKeyCode() == KeyEvent.VK_S) down = false;
		}
		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_A) left = true;
			if (e.getKeyCode() == KeyEvent.VK_D) right = true;
			if (e.getKeyCode() == KeyEvent.VK_W) up = true;
			if (e.getKeyCode() == KeyEvent.VK_S) down = true;
			if(left && !house.checkLeft(player)) {
				player.moveLeft();
				house.checkLeft(player);
			}
			if(right && !house.checkRight(player)) {
				player.moveRight();
				house.checkRight(player);
			}
			if(up && !house.checkUp(player)) {
				player.moveUp();
				house.checkUp(player);
			}
			if(down && !house.checkDown(player)) {
				player.moveDown();
				house.checkDown(player);
			}

		}




		@Override
		public void keyTyped(KeyEvent e) {}

	}

	long lastShot = 0;

	void shoot() {
		int pCenterX = player.x+player.width/2;
		int pCenterY = player.y+player.height/2;//finds center of the players
		if (bulletList.size() >= Bullets.MAXBULLETS) return;

		long now = System.currentTimeMillis();
		long elapsed = now - lastShot;
		if (elapsed < Bullets.SHOTDELAY) return;
		lastShot = now;
		Bullets bullet = new Bullets(pCenterX, pCenterY, mouseX, mouseY);
		bulletList.add(bullet);
		//	bulletList.get(bulletList.size()-1).speedCalcX(mouseX, pCenterX);//only calculates for the last bullet
		//	bulletList.get(bulletList.size()-1).speedCalcY(mouseY, pCenterY);
		this.setTitle(mouseX + ", " + mouseY + ", " + mClicked);	
	}
	void throwGrenade() {
		int pCenterX = player.x+player.width/2;
		int pCenterY = player.y+player.height/2;//finds center of the players

		long now = System.currentTimeMillis();
		long elapsed = now - lastShot;
		if (elapsed < Bullets.SHOTDELAY) return;
		lastShot = now;
		Grenade grenade = new Grenade(pCenterX, pCenterY,elapsed, mouseX, mouseY);
		//	bulletList.get(bulletList.size()-1).speedCalcX(mouseX, pCenterX);//only calculates for the last bullet
		//	bulletList.get(bulletList.size()-1).speedCalcY(mouseY, pCenterY);
		this.setTitle(mouseX + ", " + mouseY + ", " + mClicked);	
	}

	void moveBullets() {

		for (Bullets z : bulletList) {
			z.move();	
			if(house.checkWalls(z)) {
				bulletList.remove(z);
				break;
			}
		}

		for(Bullets z : bulletList) {
			if (z.y < 0 || z.x < 0) bulletList.remove(z);			
			//TODO: also if they go off of the other two sides

			break;
		}
	}
	
	
	
	
	

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		drPanel.repaint();
		this.setTitle(mouseX + ", " + mouseY + ", " + mClicked);
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
		mClicked++;
		drPanel.repaint();

	}


	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}
}

