package newPunto;

public class Triangolo {
	private Punto cord1;
	private Punto cord2;
	private Punto cord3;
	private double lat1;
	private double lat2;
	private double lat3;
	
	public Triangolo (Punto cord1, Punto cord2, Punto cord3) {
		this.cord1 = cord1;
		this.cord2 = cord2;
		this.cord3 = cord3;
		setLat();
	}

	private void setLat() {
		this.lat1 = this.cord1.dist(this.cord2);
		this.lat2 = this.cord2.dist(this.cord3);
		this.lat3 = this.cord3.dist(this.cord1);
	}
	
	
	
	public double getLat1() {
		return lat1;
	}

	public double getLat2() {
		return lat2;
	}

	public double getLat3() {
		return lat3;
	}

	public void latOut() {
		System.out.println("lato 1 " + lat1);
		System.out.println("lato 2 " + lat2);
		System.out.println("lato 3 " + lat3);

	}

	
	public void getVertices() {
		System.out.println("i vertici del tuo triangolo sono:" + "\n");
		System.out.print("vertice 1: ");
		this.cord1.cordsOut();
		System.out.print("\n" + "vertice 2: ");
		this.cord2.cordsOut();
		System.out.print("\n" + "vertice 3: ");
		this.cord3.cordsOut();
		System.out.print("\n");

	}

	public Boolean isEquilatero() {
//		tutti i lati sono diversi tra loro: il triangolo si dice scaleno.
//		due lati sono uguali tra loro: il triangolo in questo caso è chiamato isoscele.
//		tutti i tre lati sono uguali: allora il triangolo è equilatero.
		if (this.lat1 != this.lat2 && this.lat2 != this.lat3 && this.lat3 != this.lat1) {
			System.out.println("il triangolo è scaleno");
			return false;
		} else if (this.lat1 == this.lat2 && this.lat2 == this.lat3) {
			System.out.println("il triangolo e' equilatero");
			return true;
		} else {
			System.out.println("il tiangolo e isoscele");
			return false;
		}
		
	}
		
	public double perimeter() {
		double perimeter = this.lat1 + this.lat2 + this.lat3;
		return perimeter;
		
		

	}

	
}
