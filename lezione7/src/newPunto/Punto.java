package newPunto;

public class Punto {
	private int x;
	private int y;
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public static Boolean isPositive(int cord) {
		System.out.println(cord > 0 ? "" : "coordinata non valida");
		return cord > 0 ? true : false;
	}
	
	public double dist (Punto p2) {
		double dist = Math.sqrt(Math.pow((this.x - p2.getX()), 2) + Math.pow((this.y - p2.getY()), 2));
		return dist;
	}



	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}
}
