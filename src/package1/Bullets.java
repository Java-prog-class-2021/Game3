
import java.awt.Rectangle;

class Bullets extends Rectangle{
	
	
	static final int MAXBULLETS = 20; //max number of lasers (shots) on screen at one time
	static final int SHOTDELAY = 250; //milliseconds between each shot
	
	int speed = 5;  //yspeed
	
	Bullets(int x, int y){
		this.x = x;
		this.y = y;
		width  = 10;
		height = 10;
	}
}