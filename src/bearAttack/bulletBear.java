package bearAttack;

import javafx.scene.shape.Rectangle;

public class bulletBear extends Bear {
	private Rectangle r;
	private int bounceCount = 0;
	
	/**The favored projectile of the boss bear
	 * 
	 * @param x
	 * @param y
	 * @param xv
	 * @param yv
	 */
	public bulletBear(double x, double y, double xv, double yv) {
		super(x,y,xv,yv);
		r = new Rectangle(x + 6, y + 4, 25, 34);
	}
	

	// rebounds bear from edges of screen 
	public void rebound() {
		if (bounceCount > 3) {
			super.dead = true;
		}
		if ((xvel > 0 && x > 1163) || (xvel < 0 && x < 0)) {
			xvel = -1*xvel;
			bounceCount++;
		}
		if ((yvel > 0 && y > 760) || (yvel < 0 && y < 0)) {
			yvel = -1*yvel;
			bounceCount++;
		}
	}

	// updates and returns rectangle
	public Rectangle getRekt() {
	    r.setX(super.getX() + 6);
	    r.setY(super.getY() + 4);
	    return r;
	}
}
