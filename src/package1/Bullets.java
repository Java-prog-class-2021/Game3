
import java.awt.Rectangle;
import java.util.ArrayList;
import java.awt.Graphics;
import java.lang.Math;


class Bullets extends Rectangle{
	
	
	static final int MAXBULLETS = 20; //max number of lasers (shots) on screen at one time
	static final int SHOTDELAY = 250; //milliseconds between each shot
	
	double xx, yy;
	double speedY = 10.0;  //yspeed
	double speedX = 10.0;
	double speed = 5.0;
	
	Bullets(double xx, double yy, int mouseX, int mouseY){
		//xx and yy are the location of the bullet in double precision
		//They start at the player x and y
		this.xx = xx;
		this.yy= yy;
		width  = 10;
		height = 10;
		
		//calculate angle and speed		
		double angle = Math.atan2(mouseY-yy,mouseX-xx);
		speedX = speed*Math.cos(angle);
		speedY = speed*Math.sin(angle);
	}
	
	void move() {
		xx += speedX;
		yy += speedY;
		
		//after you move, update the Rectangle int x and y
		//this is for painting the bullets
		x = (int)xx;
		y = (int)yy;
	}
	void paint(Graphics g) {
		g.fillOval(x,y, width, height);
	}
	
	/*
	 * void speedCalcX(int mouseX, int pCenterX) { speedX = (mouseX-pCenterX)/10; }
	 * 
	 * void speedCalcY(int mouseY, int pCenterY) { speedY = (pCenterY-mouseY)/10; }
	 * void angleCalc() { double angle = Math.atan2(speedY,speedX); }
	 */
	
}
