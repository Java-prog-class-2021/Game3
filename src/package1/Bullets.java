
import java.awt.Rectangle;
import java.util.ArrayList;


class Bullets extends Rectangle{
	
	
	static final int MAXBULLETS = 20; //max number of lasers (shots) on screen at one time
	static final int SHOTDELAY = 250; //milliseconds between each shot
	
	
	double speedY;  //yspeed
	double speedX;
	
	Bullets(int x, int y){
		this.x = x;
		this.y = y;
		width  = 10;
		height = 10;
	}
	
	
	void speedCalcX( int mouseX,  int xCoord) {
		
		speedX = (mouseX-xCoord)/250;
	}
	
	void speedCalcY( int mouseY,  int yCoord) {
		speedY = (mouseY-yCoord)/250;
	}
}