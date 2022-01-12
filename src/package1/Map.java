import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
public class Map {
	int x,y,width,length;
	public Map(int x,int y, int width, int length) {
		this.x=x;//the coordinate of the left side of the map
		this.y=y;//the coordinate of the top side of the map
		this.width=width;
		this.length=length;
	}
	void paint(Graphics g) {
		g.drawRect(x,y,width,length);
		g.setColor(Color.GREEN);
		g.fillRect(x,y,width,length);
	}
	
	private boolean outOfBoundsEast(Character c) {
		if((c.x+c.width)>=(x+width)) {
			return true;
		}else return false;
	}
	private boolean outOfBoundsWest(Character c) {
		if(c.y<=y) {
			return true;
		}else return false;
	}
	private boolean outOfBoundsNorth(Character c) {
		if(c.y<=y) {
			return true;
		}else return false;
	}
	private boolean outOfBoundsSouth(Character c) {
		if((c.y+c.height)>=(y+length)) {
			return true;
		}else return false;
	}
	
	void pMoveRight(Character c) {//"moves" the player to the right
		if(!outOfBoundsWest(c)) {
			x-=c.speed;
		}
	}
	
	void pMoveLeft(Character c) {//"moves" the player to the right
		if(!outOfBoundsEast(c)) {
			x+=c.speed;
		}
	}
	void pMoveUp(Character c) {//"moves" the player to the right
		if(!outOfBoundsNorth(c)) {
			y+=c.speed;
		}
	}
	void pMoveDown(Character c) {//"moves" the player to the right
		if(!outOfBoundsSouth(c)) {
			y-=c.speed;
		}
	}
	
}
