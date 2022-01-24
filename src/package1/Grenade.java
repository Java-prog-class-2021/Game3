
public class Grenade extends Bullets{
	long thrown;
	static final int COOLDOWN = 10000;
	public Grenade(double xx, double yy,long thrown, int mouseX, int mouseY) {
		super(xx,yy,mouseX,mouseY);
		speed = 100/thrown;
		this.thrown=thrown;//is the time when the grenade is thrown, in milliseconds
	}
	
	@Override
	void move() {
		speed = 100/thrown;
		xx+=speedX;
		yy+=speedY;
	}
	
}
