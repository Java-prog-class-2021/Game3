import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Image;


import java.awt.Color;
class Character{
	int x;//left side of character
	int y;//top side of character
	
	int diameter,health;
	int gunLength;
	int speed=3;
	int cx;
	int cy;
	
	Image characterImg;

//	int playerW = characterImg.getdiameter(null);	
//	int playerH = characterImg.getdiameter(null);
	
	Character(int x, int y, int diameter){
		this.x=x;
		this.y=y;
		this.diameter=diameter;
		cx = x+(diameter/2);
		cy = y+(diameter/2);
		gunLength = diameter/2+15;
		
//		String filename =  "characterImg.jpg"; //this is in a resource folder		
//		characterImg = loadImage(filename);
		
		
	}
	void paint(Graphics2D g,double angle) {
		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(10));
		
		double gunX = cx+gunLength*Math.cos(angle);
		double gunY = cy+gunLength*Math.sin(angle);
		
		g.drawLine((int)gunX,(int)gunY,(int)cx,(int)cy);
		g.setColor(new Color(255,220,177));
		g.fillOval(x,y,diameter,diameter);
		
		g.setColor(Color.BLACK);
	}
	void moveRight() {
		x+=speed;
		cx+=speed;
		
	}
	void moveLeft() {
		x-=speed;
		cx-=speed;
	}
	void moveUp() {
		y-=speed;
		cy-=speed;
	}
	void moveDown() {
		y+=speed;
		cy+=speed;
	}
	
//	Image loadImage(String filename) {
//
//		Image image = null;
//		
//		
//		// Requires a / at the beginning of the filename
//		URL imageURL = this.getClass().getResource("/" + filename); 
//
//		// Filename must be relative (no / at beginning) 
////		InputStream inputStr = DrawAndScaleImage.class.getClassLoader().getResourceAsStream(filename);
//
//		//Method 1. URL using ImageIcon
//		if (imageURL != null) {
//			ImageIcon icon = new ImageIcon(imageURL);				
//			image = icon.getImage();
//		} else {
//			JOptionPane.showMessageDialog(null, "An image failed to load: " + filename , "ERROR", JOptionPane.ERROR_MESSAGE);
//		}
//		return image;
//	}
	
//	public void rotate(int mouseX, int mouseY) {
//		double angle = Math.atan2(mouseY-yy,mouseX-xx);
//		PointD tempPoint = rotatePoint(angle, gunX1,gunY1,cx,cy);
//		gunX1 =tempPoint.x;
//		gunY1 =tempPoint.y;
//		
////		tempPoint = rotatePoint(angle, gunX2,gunY2,cx,cy);
////		gunX2 = tempPoint.x;
////		gunY2 = tempPoint.y;
//	}
//	
//	PointD rotatePoint(double angle, double x, double y, double centrex, double centrey) {
//		double newx = (x-centrex) * (Math.cos(angle)%(Math.PI*2)) + (y-centrey) * (Math.sin(angle)%(Math.PI*2));
//		double newy = -(x-centrex) * (Math.sin(angle)%(Math.PI*2)) + (y-centrey) * (Math.cos(angle)%(Math.PI*2));
//		PointD pd = new PointD(); 
//		pd.x = newx+centrex;
//		pd.y = newy+centrey;
//		return pd;
//	}
	
	private class PointD {
		double x, y;
	}
}
