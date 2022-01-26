import java.awt.Graphics;
import java.awt.Color;
class Character{
	int x;//left side of character
	int y;//top side of character
	int width;
	int height;
	int health;
	int speed=3;
	
	Character(int x, int y, int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(x,y,width,height);
	}
	void moveRight() {
		x+=speed;
	}
	void moveLeft() {
		x-=speed;
	}
	void moveUp() {
		y-=speed;
	}
	void moveDown() {
		y+=speed;
	}
}
