
import java.awt.Rectangle;
import java.util.ArrayList;


class Bullets extends Rectangle{
	
	
	static final int MAXBULLETS = 20; //max number of lasers (shots) on screen at one time
	static final int SHOTDELAY = 250; //milliseconds between each shot
	
	
	int calcY;  //yspeed
	int calcX;
	
	Bullets(int x, int y){
		this.x = x;
		this.y = y;
		width  = 10;
		height = 10;
	}
	
	
	int speedCalcX(int mouseX, Character player) {
		
		calcX = (mouseX-(player.x+player.width/2))/250;
		
		return calcX;
	}
	
	int speedCalcY(int mouseY, Character player) {
		
		
		calcY = (mouseY-(player.y+player.height/2))/100;

		return calcY;
	}
}