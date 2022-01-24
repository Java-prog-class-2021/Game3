
import java.awt.Rectangle;
import java.util.ArrayList;
import java.awt.Graphics;
import java.lang.Math;


class Bullets extends Rectangle{
	
	
	static final int MAXBULLETS = 20; //max number of lasers (shots) on screen at one time
	static final int SHOTDELAY = 250; //milliseconds between each shot
	
	double speedY = 10.0;  //yspeed
	double speedX = 10.0;
	
	Bullets(int x, int y){
		this.x = x;
		this.y = y;
		width  = 10;
		height = 10;
	}
	
	void paint(Graphics g) {
		g.fillOval(x,y, width, height);
	}
	
	void speedCalcX(int mouseX, int pCenterX) {
		speedX = (mouseX-pCenterX)/10;
	}
	
	void speedCalcY(int mouseY, int pCenterY) {
		speedY = (pCenterY-mouseY)/10;
	}
	void angleCalc() {
		
	}
	
}