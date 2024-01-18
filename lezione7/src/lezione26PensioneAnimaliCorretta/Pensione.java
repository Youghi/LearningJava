package lezione26PensioneAnimaliCorretta;

import java.util.ArrayList;
import java.util.Scanner;

import esercizio26pensioneAnimali.Animal;
import esercizio26pensioneAnimali.Form;
import esercizio26pensioneAnimali.Owner;
import esercizio26pensioneAnimali.Schedule;

public class Pensione {

	Scanner userIn;
	private ArrayList<Animale> animali = new ArrayList<Animale>();
	private ArrayList<Proprietario> proprietari = new ArrayList<Proprietario>();
	private ArrayList<SchedaS> schede = new ArrayList<SchedaS>();

	public Pensione(Scanner scan) {
		userIn = scan;
	}

	public void addForm() {
		SchedaS scheda = new SchedaS(userIn);

		System.out.println("Lei è gia stato nostro cliente?" + "\n" + "1 - si" + "\n" + " 2 - no");
		int ind = userIn.nextInt();

		switch (ind) {
		case 1:
			System.out.println("Persone registrate:");
			for (int i = 0; i < proprietari.size(); i++) {
				System.out.println(i + ": ");
				proprietari.get(i).getOwner();
			}
			System.out.println("inserire numero cliente da selezionare:");
			int code = userIn.nextInt();
			scheda.setProprietario(proprietari.get(code));
			break;

		case 2:
			
			break;
		}
	}

	public void modifyForm() {

	}

	public void removeForm() {

	}

	public void getForms() {

	}

	public void getAnimals() {

	}

	public void getOwners() {

	}

}
