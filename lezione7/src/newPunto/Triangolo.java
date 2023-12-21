package newPunto;

public class Triangolo {
	private Punto cord1;
	private Punto cord2;
	private Punto cord3;
	private double lat1 = cord1.dist(cord2);
	private double lat2 = cord2.dist(cord3);
	private double lat3 = cord3.dist(cord1);
	
	public Triangolo (Punto cord1, Punto cord2, Punto cord3) {
		this.cord1 = cord1;
		this.cord2 = cord2;
		this.cord3 = cord3;
	}
	
	public double perimeter () {
		double perimeter = cord1.dist(cord2) + cord2.dist(cord3) + cord3.dist(cord1);
		return perimeter;
	}
	
	public Boolean isIsocele () {
//		tutti i lati sono diversi tra loro: il triangolo si dice scaleno.
//		due lati sono uguali tra loro: il triangolo in questo caso è chiamato isoscele.
//		tutti i tre lati sono uguali: allora il triangolo è equilatero.
		if (this.lat1 != this.lat2 && this.lat2 != this.lat3 && this.lat3 != this.lat1) {
			System.out.println("il triangolo è scaleno");
		}
		
		
		
	}

	
}
