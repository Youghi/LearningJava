package newPunto;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double dist (Punto p2) {
		double dist = Math.sqrt(Math.pow((this.x - p2.getX()), 2) + Math.pow((this.y - p2.getY()), 2));
		return dist;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void cordsOut() {
		System.out.print(" x = " + x + " y = " + y);
	}

	public static Punto generateP() {
		double cordX = (int) (Math.random() * 10);
		double cordY = (int) (Math.random() * 10);
		Punto p = new Punto(cordX, cordY);
		return p;
	}
}
