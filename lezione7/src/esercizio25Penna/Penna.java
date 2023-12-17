package esercizio25Penna;

/*
 	Definisci la classe Penna caratterizzata dagli attributi colore e inchiostro rimanente. La quantità
	di inchiostro è un numero compreso fra 0 (inchiostro finito) e 100 (penna piena), i colori possibili
	sono blue, rosso e nero. Quando crei un oggetto penna inizialmente dovrà essere piena. Si crei
	nella classe Penna il metodo scrive() che consuma l’inchiostro un’unità alla volta in base al
	numero di lettere che una persona vuole scrivere. La penna consuma un’unità di inchiostro ogni
	20 lettere. Se il numero di lettere non è divisibile per 20, si considera l’intero e non si considera
	il resto.
	Crea una classe Esercizio25Main dove poni il metodo main. Il metodo main dovrà generare 3
	penne di colore diverso, poi chiederà all’utente il colore della penna con cui vuole scrivere e
	verrà generato casualmente il numero di lettere da scrivere (dovrà essere un numero fra 0 e
	10000), dopodichè la penna scriverà le lettere. Alla fine comunicherà all’utente se la penna è
	finita e se non è finita, quanto inchiostro è rimasto.
 */

public class Penna {
	private int ink = 100;
	private String color;

	public Penna(String color) {
		this.color = color;
	}

	public int getInk() {
		return ink;
	}

	public String getColor() {
		return color;
	}

	public void inkOut() {
		System.out.print("\ninchiostro rimanente:\n");
		for (int i = 0; i < this.ink; i++) {
			System.out.print("█");
		}
		System.out.print(this.ink);
		System.out.println(" ");
	}

	public void write(String frase) {
		int length = frase.replace(" ", "").length();
		// System.out.println("str= " + length);
		this.ink = this.ink - length;
		// System.out.println(ink);
		inkOut();

	}

}
