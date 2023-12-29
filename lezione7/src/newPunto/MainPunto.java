package newPunto;

import java.util.Scanner;

/*
	1. Definisci una classe Punto che abbia come attributi le coordinate x e y di un punto.
	
	Nello sviluppo dei punti successivi considera solo coordinate positive.

	9. Nella classe Punto definisco una funzione che stampa le coordinate di un punto
	
	10. Nella classe Punto definisco il metodo PuntiUguali() che confronta le coordinate di due
		punti e dirà se i punti sono uguali oppure no.
	
	11. Nella classe Punto definisco un metodo che calcola la distanza di un punto da un altro
	
	12. Nel metodo main genero due punti generando casualmente le coordinate del punto che
	possono avere valori interi compresi fra 0 e 10 E utilizzando la funzione appena creata 
	ne faccio il confronto stabilendo se sono diversi o uguali.
	
	13. Nel classe Punto definisco una funzione generaPunto() che genera e ritorna un oggetto
		di classe Punto generando casualmente le coordinate del punto che possono avere
		valori interi compresi fra 0 e 10 (definisco questo metodo static poiché generando un
		oggetto di classe Punto non dovrà essere associato a nessun Punto specifico, ma è
		bene che rimanga un’azione specifica della classe Punto)
	
	14. Nel metodo Main invoco la funzione genera Punto per creare un oggetto di classe Punto
		e ne stampo le coordinate usando la funzione opportuna
	
	15. Nello stesso package, creo una classe Triangolo i cui attributi sono tre variabili di classe
		Punto, una per ogni vertice del triangolo. Si passino al costruttore della classe i tre punti
		vertici del punto)
	
	16. Nella classe Triangolo definisco la funzione che calcola il perimetro del triangolo
	
	17. Nella classe Triangolo definisco una funzione che verifica se il triangolo è equilatero,
		isoscele o scaleno.
	
	18. Nella classe Triangolo definisco la funzione che calcola l’area se il triangolo è equilatero
	
	19. Nel metodo main genero i tre punti vertici (utilizzando la funzione opportuna) di un
		triangolo e poi il triangolo stesso, ne calcolo il perimetro e l’area se il triangolo è
		equilatero
 */
public class MainPunto {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);

		Triangolo triangolo = initTriangolo();

		triangolo.getVertices();
		triangolo.latOut();
		Boolean equilateroCheck = triangolo.isEquilatero();
		System.out.println(
				equilateroCheck == true
						? "area del triangolo: " + areaOfEquiTri(triangolo) + "\n" + "perimetro del triangolo: "
								+ triangolo.perimeter()
						: "");
		
//		Boolean check = false;
//		while (check == false) {
//			System.out.println("inserire x:");
//			int x = userIn.nextInt();
//			check = Punto.isPositive(x);
//		}
//		
//		check = false;
//		
//		while (check == false) {
//			System.out.println("\n" + "inserire y:");
//			int y = userIn.nextInt();
//			check = Punto.isPositive(y);
//		}
		
		
		

	}
	
	public static Triangolo initTriangolo() {
//		Scanner userIn = new Scanner(System.in);
//		System.out.println("inserire le coordinate dei 3 vertici:" );
//		
//		System.out.println("vertice 1");
//
//		Boolean check = false;
//		double xV1 = 0;
//		while (check == false) {
//			System.out.println("inserire x:");
//			xV1 = userIn.nextDouble();
//			// System.out.println(xV1);
//			check = isPositive(xV1);
//		}
//		
//		check = false;
//		double yV1 = 0;
//		while (check == false) {
//			System.out.println("inserire y:");
//			yV1 = userIn.nextDouble();
//			check = isPositive(yV1);
//		}
//		Punto v1 = new Punto(xV1, yV1);
//		
//		System.out.println("vertice 2");
//
//		check = false;
//		double xV2 = 0;
//		while (check == false) {
//			System.out.println("inserire x:");
//			xV2 = userIn.nextDouble();
//			check = isPositive(xV2);
//		}
//		
//		check = false;
//		double yV2 = 0;
//		while (check == false) {
//			System.out.println("inserire y:");
//			yV2 = userIn.nextDouble();
//			check = isPositive(yV2);
//		}
//		Punto v2 = new Punto(xV2, yV2);
//		
//		
//		System.out.println("vertice 3");
//
//		check = false;
//		double xV3 = 0;
//		while (check == false) {
//			System.out.println("inserire x:");
//			xV3 = userIn.nextDouble();
//			check = isPositive(xV3);
//		}
//		
//		check = false;
//		double yV3 = 0;
//		while (check == false) {
//			System.out.println("inserire y:");
//			yV3 = userIn.nextDouble();
//			check = isPositive(yV3);
//		}
//		Punto v3 = new Punto(xV3, yV3);
		
		Punto v1 = Punto.generateP();
		Punto v2 = Punto.generateP();
		Punto v3 = Punto.generateP();
		
		Triangolo triangolo = new Triangolo(v1, v2, v3);
		
		return triangolo;
	}

	public static Boolean isPositive(double cord) {
		System.out.println(cord >= 0 ? "" : "coordinata non valida");
		return cord >= 0 ? true : false;
	}
	
	public static double areaOfEquiTri(Triangolo tri) {
		// A=(√(3)/4)L2
		double area = (Math.sqrt(3) * 4) * tri.getLat1();
		return area;
	}

}
