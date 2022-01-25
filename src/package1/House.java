import java.awt.Graphics;
import java.awt.Color;
public class House {
	
	public House(){
		
	}
	void paint(Graphics g) {


		//main building walls x, y, width, height
		//top left kitchen wall
		g.setColor(Color.DARK_GRAY);
		g.fillRect(400, 350, 450, 90);
		g.fillRect(400, 440, 90, 90);
		g.fillRect(850, 250, 90, 280);
		g.fillRect(940, 440, 150, 90);
		
		//right middle wall
		g.fillRect(1200, 440, 240, 90);
		g.fillRect(1350, 340, 90, 190);
		
		//top wall
		g.fillRect(850, 60, 590, 90);
		g.fillRect(1350, 150, 90, 100);
		
		//bottom wall
		g.fillRect(490, 840, 950, 90);
		g.fillRect(400, 730, 90, 200);
		
		//singular 90x100 wall (right middle)
		g.fillRect(1350, 635, 90, 100);
		
		//glass windows
		g.setColor(Color.decode("#c9f6f4"));
		g.fillRect(400, 530, 20, 105);
		g.fillRect(1420, 735, 20, 105);
		g.fillRect(1420, 530, 20, 105);
		g.fillRect(850, 150, 20, 100);		
		
		//kitchen counter
		g.setColor(Color.decode("#e5e7e6"));
		g.fillRect(490, 440, 360, 90);
		
		//stove
		g.setColor(Color.decode("#454340"));
		g.fillRect(540, 448, 75, 75);
		g.setColor(Color.decode("#958e85"));
		g.drawOval(548, 455, 25, 25);
		g.drawOval(580, 455, 25, 25);
		g.drawOval(548, 490, 25, 25);
		g.drawOval(580, 490, 25, 25);
		
		//wooden floors
		g.setColor(Color.decode("#a46f37"));
		g.fillRect(1090, 440, 110, 25);//
		g.fillRect(1090, 485, 110, 20);//
		g.fillRect(420, 530, 1000, 25);//
		g.fillRect(420, 575, 1000, 20);//
		g.fillRect(420, 615, 1000, 20);//
		g.fillRect(400, 655, 950, 20);//
		g.fillRect(400, 695, 950, 20);//
		g.fillRect(490, 735, 930, 20);
		g.fillRect(490, 775, 930, 20);
		g.fillRect(490, 815, 930, 25);
		
		g.setColor(Color.decode("#b57939"));
		g.fillRect(1090, 465, 110, 20);//
		g.fillRect(1090, 505, 110, 25);//
		g.fillRect(420, 555, 1000, 20);//
		g.fillRect(420, 595, 1000, 20);//
		g.fillRect(400, 635, 950, 20);//
		g.fillRect(400, 675, 950, 20);//
		g.fillRect(400, 715, 950, 20);//
		g.fillRect(490, 755, 930, 20);
		g.fillRect(490, 795, 930, 20);
		
		g.setColor(Color.decode("#503b20"));
		g.drawLine(1145, 440, 1145, 465);
	}
}
