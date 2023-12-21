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
		Boolean check = false;

		while (check == false) {
			System.out.println("inserire x:");
			int x = userIn.nextInt();
			check = Punto.isPositive(x);
		}
		
		check = false;
		
		while (check == false) {
			System.out.println("\n" + "inserire y:");
			int y = userIn.nextInt();
			check = Punto.isPositive(y);
		}
		
		
		

	}
	
	public static Triangolo initTriangolo() {
		Scanner userIn = new Scanner(System.in);
		Boolean check = false;
		System.out.println("inserire le coordinate dei 3 vertici:" );
		
		System.out.println("vertice 1");
		int xV1;
		while (check == false) {
			System.out.println("inserire x:");
			xV1 = userIn.nextInt();
			check = Punto.isPositive(xV1);
		}
		
		check = false;
		int yV1;
		while (check == false) {
			System.out.println("\n" + "inserire y:");
			yV1 = userIn.nextInt();
			check = Punto.isPositive(yV1);
		}
		
		Punto v1 = new Punto(xV1, yV1);
		
		System.out.println("vertice 1");
		int xV2;
		while (check == false) {
			System.out.println("inserire x:");
			xV2 = userIn.nextInt();
			check = Punto.isPositive(xV2);
		}
		
		check = false;
		int yV2;
		while (check == false) {
			System.out.println("\n" + "inserire y:");
			yV2 = userIn.nextInt();
			check = Punto.isPositive(yV2);
		}
		
		Punto v2 = new Punto(xV2, yV2);
		
		
		System.out.println("vertice 1");
		int xV3;
		while (check == false) {
			System.out.println("inserire x:");
			xV3 = userIn.nextInt();
			check = Punto.isPositive(xV3);
		}
		
		check = false;
		int yV3;
		while (check == false) {
			System.out.println("\n" + "inserire y:");
			yV3 = userIn.nextInt();
			check = Punto.isPositive(yV3);
		}
		
		Punto v3 = new Punto(xV3, yV3);
		
		
		
		
		
		
		return triangolo;
	}

	

}
