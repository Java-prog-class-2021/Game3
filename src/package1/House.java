import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class House{
	//is the array of x coords for walls and structures the player can't walk through
	int[] xWalls = {/*0-3 top left kitchen wall*/400,400,850,940,
			/*4,5 right middle wall*/1200,1350,
			/*6,7 top wall*/850,1350,
			/*8,9 bottom wall*/490,400,
			/*10 singular 90x100 wall (right middle)*/1350,
			/*11-14 Glass window*/400,1420,1420,850,
			/*15 Kitchen counter*/490};

	//is the array of y coords for walls ans tructures the player can't walk through
	int[] yWalls = {/*top left kitchen wall*/350,440,250,440,
			/*right middle wall*/440,340,
			/*top wall*/60,150,
			/*bottom wall*/840,730,
			/*singular 90x100 wall(right middle)*/635,
			/*glass windows*/530,735,530,150,
			/*Kitchen counter*/440};

	int[] widthWalls = {/*0-3 top left kitchen wall*/450,90,90,150,
			/*4,5 Right middle wall*/240,90,
			/*6,7 top wall*/590,90,
			/*8,9 Bottom wall*/950,90,
			/*10 singular 90x100 wall*/90,
			/*11-14 glass windows*/20,20,20,20,
			/*15 Kitchen counter*/360};

	int[] heightWalls = {/*0-3 top left kitchen wall*/90,90,280,90,
			/*4,5 right middle wall*/90,190,
			/*6,7 top wall*/90,100,
			/*8,9 bottom wall*/90,200,
			/*10 singular 90x100 wall*/100,
			/*11-14 glass windows*/105,105,105,100,
			/*15 Kitchen counter*/90};

	//this is the array for x coords of stuff the player can walk through, or doesn't affect the player
	//	int[] xRemaining = {/*Stove*/540,/*Stove2 (after recolor)*/548,580,548,580,
	//				/*Wooden floors*/1090,1090,420,420,420,400,400,490,490,490,
	//				/*Extra line*/1145};
	//	int[] yRemainging = {/*Stove*/};



	//TODO need to finish xRemaining, yRemaining, diameterRemainging and diameterRemaining if this constructor is to be used
	//	public House(int xshift,int yshift){
	//		//xshift moves all the x coords from the original position of x by xshift
	//		//yshift moves all the y coords from the original position of y by yshift
	//		for(int i=0;i<this.xWalls.length;i++) {
	//			xWalls[i]+=xshift;
	//		}
	//		for(int i=0;i<this.yWalls.length;i++) {
	//			yWalls[i]+=yshift;
	//		}
	//	}

	public House() {}
	void paint(Graphics g) {


		//main building walls x, y, diameter, diameter
		//wooden floors
		g.setColor(Color.decode("#b57939"));
		g.fillRect(400,465,1020,400);
		//		g.fillRect(1090, 465, 110, 20);//
		//		g.fillRect(1090, 505, 110, 25);//
		//		g.fillRect(420, 555, 1000, 20);//
		//		g.fillRect(420, 595, 1000, 20);//
		//		g.fillRect(400, 635, 950, 20);//
		//		g.fillRect(400, 675, 950, 20);//
		//		g.fillRect(400, 715, 950, 20);//
		//		g.fillRect(490, 755, 930, 20);
		//		g.fillRect(490, 795, 930, 20);

		g.setColor(Color.decode("#503b20"));
		g.drawLine(1145, 440, 1145, 465);

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
		
		((Graphics2D) g).setStroke(new BasicStroke(3));
		g.setColor(Color.decode("#503b20"));
		//vertical lines on dark wood
		g.drawLine(1100, 441, 1100, 465);	
		g.drawLine(1100, 485, 1100, 505);
		g.drawLine(725, 531, 725, 550);
		g.drawLine(1100, 531, 1100, 550);

		int y1=574;
		int y2=592;
		for (int i=0; i<2; i++) {
			g.drawLine(725, y1, 725, y2);
			g.drawLine(1100, y1, 1100, y2);
			y1+=40;
			y2+=40;
		}
		
		int y3=656;
		int y4=672;
		for (int i=0; i<4; i++) {
			g.drawLine(725, y3, 725, y4);
			g.drawLine(1100, y3, 1100, y4);
			y3+=40;
			y4+=40;
		}
		
		g.drawLine(725, 816, 725, 838);
		g.drawLine(1100, 816, 1100, 838);
		
		//vertical lines on light wood
		int y5=553;
		int y6=570;
		for (int i=0; i<6; i++) {
			g.drawLine(573, y5, 573, y6);
			g.drawLine(915, y5, 915, y6);
			g.drawLine(1275, y5, 1275, y6);
			y5+=41;
			y6+=41;
		}
		g.drawLine(573, 798, 573, 814);
		g.drawLine(915, 798, 915, 814);
		g.drawLine(1275, 798, 1275, 814);		

		//horizontal lines in floor boards
		g.drawLine(1091, 441, 1198, 441);
		g.drawLine(1091, 465, 1198, 465);
		g.drawLine(1091, 485, 1198, 485);
		g.drawLine(1091, 505, 1198, 505);
		g.drawLine(1091, 528, 1198, 528);
		g.drawLine(421, 553, 1418, 553);
		g.drawLine(421, 573, 1418, 573);
		g.drawLine(421, 593, 1418, 593);
		g.drawLine(421, 613, 1418, 613);
		g.drawLine(421, 635, 1418, 635);
		g.drawLine(401, 655, 1348, 655);
		g.drawLine(401, 675, 1348, 675);
		g.drawLine(401, 695, 1348, 695);
		g.drawLine(401, 715, 1348, 715);
		g.drawLine(401, 735, 1418, 735);
		g.drawLine(491, 755, 1418, 755);
		g.drawLine(491, 775, 1418, 775);
		g.drawLine(491, 795, 1418, 795);
		g.drawLine(491, 815, 1418, 815);



		//top left kitchen wall
		g.setColor(Color.DARK_GRAY);
		for(int i=0;i<4;i++) g.fillRect(xWalls[i],yWalls[i],widthWalls[i],heightWalls[i]);


		//		g.fillRect(400, 350, 450, 90);
		//		g.fillRect(400, 440, 90, 90);
		//		g.fillRect(850, 250, 90, 280);
		//		g.fillRect(940, 440, 150, 90);

		//right middle wall
		for(int i=4;i<6;i++) g.fillRect(xWalls[i],yWalls[i],widthWalls[i],heightWalls[i]);
		//		g.fillRect(1200, 440, 240, 90);
		//		g.fillRect(1350, 340, 90, 190);

		//top wall
		for(int i=6;i<8;i++) g.fillRect(xWalls[i],yWalls[i],widthWalls[i],heightWalls[i]);
		//		g.fillRect(850, 60, 590, 90);
		//		g.fillRect(1350, 150, 90, 100);

		//bottom wall
		for(int i=8;i<10;i++) g.fillRect(xWalls[i],yWalls[i],widthWalls[i],heightWalls[i]);
		g.fillRect(490, 840, 950, 90);
		g.fillRect(400, 730, 90, 200);

		//singular 90x100 wall (right middle)
		g.fillRect(xWalls[10],yWalls[10],widthWalls[10],heightWalls[10]);

		//glass windows
		g.setColor(Color.decode("#c9f6f4"));
		for(int i=11;i<15;i++) g.fillRect(xWalls[i],yWalls[i],widthWalls[i],heightWalls[i]);
		//		g.fillRect(400, 530, 20, 105);
		//		g.fillRect(1420, 735, 20, 105);
		//		g.fillRect(1420, 530, 20, 105);
		//		g.fillRect(850, 150, 20, 100);		

		//kitchen counter
		g.setColor(Color.decode("#e5e7e6"));
		g.fillRect(xWalls[15],yWalls[15],widthWalls[15],heightWalls[15]);

		//stove
		g.setColor(Color.decode("#454340"));
		g.fillRect(540, 448, 75, 75);
		g.setColor(Color.decode("#958e85"));
		g.drawOval(548, 455, 25, 25);
		g.drawOval(580, 455, 25, 25);
		g.drawOval(548, 490, 25, 25);
		g.drawOval(580, 490, 25, 25);
		
		//THE FOLLOWING IS THE ORANGE BORDERS AROUND EACH WALL
		//top left kitchen wall (orange border)
		g.setColor(Color.decode("#de7a00"));
		g.fillRect(400, 350, 15, 180);
		g.fillRect(925, 250, 15, 190);
		g.fillRect(850, 440, 15, 90);
		g.fillRect(400, 350, 450, 15);
		g.fillRect(850, 250, 90, 15);
		g.fillRect(400, 515, 90, 15);
		g.fillRect(475, 440, 15, 90);
		g.fillRect(475, 425, 390, 15);
		g.fillRect(850, 250, 15, 115);
		g.fillRect(865, 515, 225, 15);
		g.fillRect(1075, 440, 15, 75);
		g.fillRect(925, 440, 225, 15);

		//right middle wall (orange border)
		g.fillRect(1200, 440, 15, 90);
		g.fillRect(1200, 440, 150, 15);
		g.fillRect(1425, 340, 15, 175);
		g.fillRect(1200, 515, 240, 15);
		g.fillRect(1350, 340, 90, 15);
		g.fillRect(1350, 340, 15, 115);
		
		//top wall (orange border)
		g.fillRect(850, 60, 590, 15);
		g.fillRect(850, 135, 515, 15);
		g.fillRect(1350, 150, 15, 100);
		g.fillRect(1350, 235, 90, 15);
		g.fillRect(850, 60, 15, 90);
		g.fillRect(1425, 60, 15, 190);
		
		//singular 90x100 wall (right middle) (orange border)
		g.fillRect(1350, 635, 15, 100);
		g.fillRect(1425, 635, 15, 100);
		g.fillRect(1350, 635, 90, 15);
		g.fillRect(1350, 720, 90, 15);
		
		//bottom wall (orange border)
		
		g.fillRect(400, 730, 15, 200);
		g.fillRect(475, 730, 15, 125);
		g.fillRect(1425, 840, 15, 90);
		g.fillRect(490, 840, 950, 15);
		g.fillRect(400, 915, 1040, 15);
		g.fillRect(400, 735, 1040, 15);
		
		//kitchen tile floor
		g.setColor(Color.decode("#9bbbbf"));
		g.fillRect(940, 150, 410, 290);
		g.fillRect(870, 150, 70, 100);
		g.fillRect(1350, 250, 70, 90);
		
		g.setColor(Color.decode("#8bacb1"));
		g.fillRect(880, 155, 60, 60);
		g.fillRect(1015, 155, 60, 60);
		g.fillRect(1150, 155, 60, 60);
		g.fillRect(1285, 155, 60, 60);
		g.fillRect(1015, 275, 60, 60);
		g.fillRect(1150, 275, 60, 60);
		g.fillRect(1285, 275, 60, 60);
		g.fillRect(1015, 395, 60, 40); 
		g.fillRect(1150, 395, 60, 40);
		g.fillRect(1285, 395, 60, 40);
		
		g.fillRect(947, 215, 60, 60);
		g.fillRect(1082, 215, 60, 60);
		g.fillRect(1217, 215, 60, 60);
		g.fillRect(1352, 255, 60, 23);
		g.fillRect(947, 335, 60, 60);
		g.fillRect(1082, 335, 60, 60);
		g.fillRect(1217, 335, 60, 60);


	}
	boolean checkLeft(Character c) {
		if(tlCheckLeft(c)||blCheckLeft(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkRight(Character c) {
		if(trCheckRight(c) || brCheckRight(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkUp(Character c) {
		if(trCheckUp(c) || tlCheckUp(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkDown(Character c) {
		if(blCheckDown(c) || brCheckDown(c)) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean checkWalls(Character c) {
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x >= xWalls[i]&& c.x+c.diameter <= xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter >= yWalls[i] && c.y <= yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
				}
			}
		}
		return checkWalls;
	}
	boolean checkWalls(Bullets c) {
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x+c.height >= xWalls[i]&& c.x <= xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.height >= yWalls[i] && c.y <= yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
				}
			}
		}
		return checkWalls;
	}





	boolean tlCheckUp(Character c) {//checks above top left
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x > xWalls[i]&& c.x < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y > yWalls[i] && c.y < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.y = yWalls[i]+heightWalls[i];
					c.cy=c.y+c.diameter/2;
//					c.moveDown();
				}
			}

		}

		return checkWalls;

	}
	boolean tlCheckLeft(Character c) {//checks left of top left
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x > xWalls[i] && c.x < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y > yWalls[i] && c.y < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.x = xWalls[i]+widthWalls[i];
					c.cx=c.x+c.diameter/2;
//					c.moveRight();
				}
			}
		}
		return checkWalls;
	}
	
	boolean trCheckUp(Character c) {//checks above top right corner
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x > xWalls[i]&& c.x+c.diameter < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter > yWalls[i] && c.y < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.y = yWalls[i]+heightWalls[i];
					c.cy=c.y+c.diameter/2;
					
//					c.moveDown();
				}
			}

		}

		return checkWalls;

	}
	boolean trCheckRight(Character c) {//checks right of top right
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x+c.diameter > xWalls[i]&& c.x+c.diameter< xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y > yWalls[i] && c.y < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.x = xWalls[i]-c.diameter;
					c.cx=c.x+c.diameter/2;
//					c.moveLeft();
				}
			}
		}
		return checkWalls;
	}
	
	boolean blCheckDown(Character c) {//checks below bottom left
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x > xWalls[i]&& c.x < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter > yWalls[i] && c.y+c.diameter < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.y = yWalls[i] - c.diameter;
					c.cy=c.y+c.diameter/2;
//					c.moveUp();
				}
			}
		}
		return checkWalls;
	}
	boolean blCheckLeft(Character c) {//checks the left of bottom left
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x > xWalls[i] && c.x < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter > yWalls[i] && c.y+c.diameter < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.x = xWalls[i]+widthWalls[i];
					c.cx=c.x+c.diameter/2;
//					c.moveRight();
				}
			}
		}
		return checkWalls;
	}
	


	boolean brCheckDown(Character c) {
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x+c.diameter > xWalls[i]&& c.x+c.diameter < xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter > yWalls[i] && c.y+c.diameter < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.y = yWalls[i] - c.diameter;
					c.cy=c.y+c.diameter/2;
//					c.moveUp();
				}
			}
		}
		return checkWalls;
	}
	boolean brCheckRight(Character c) {
		boolean checkWalls = false;
		for(int i=0;i<xWalls.length;i++) {
			if(c.x+c.diameter > xWalls[i]&& c.x+c.diameter< xWalls[i]+widthWalls[i]) {//checks if the x coords are within a wall
				if(c.y+c.diameter > yWalls[i] && c.y+c.diameter < yWalls[i]+heightWalls[i]) {//checks if the y coords are within a wall
					checkWalls = true;
					c.x = xWalls[i]-c.diameter;
					c.cx=c.x+c.diameter/2;
//					c.moveLeft();
				}
			}
		}
		return checkWalls;
	}

	
}
