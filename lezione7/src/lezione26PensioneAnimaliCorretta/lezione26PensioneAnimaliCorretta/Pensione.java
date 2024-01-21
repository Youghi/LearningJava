package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.ArrayList;
import java.util.Scanner;

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

		System.out.println("Lei è gia stato nostro cliente?" + "\n" + "1 - si" + "\n" + "2 - no");
		int ind = userIn.nextInt();

		switch (ind) {
		case 1:
			if (proprietari.size() == 0) {
				System.out.println("non ci sono persone registrate!");
			} else {
				System.out.println("Persone registrate:");
				for (int i = 0; i < proprietari.size(); i++) {
					System.out.println(i + ": ");
					proprietari.get(i).getOwner();
				}
				System.out.println("inserire numero cliente da selezionare:");
				int code = userIn.nextInt();
				scheda.setProprietario(proprietari.get(code));
				scheda.setAnimale(proprietari.get(code).selectAnimal());
				scheda.getAnimale().setProprietario(proprietari.get(code));
				scheda.setScheda();
				schede.add(scheda);
				break;
			}

		case 2:
			scheda.setGuest();
			scheda.setScheda();
			animali.add(scheda.getAnimale());
			proprietari.add(scheda.getProprietario());
			schede.add(scheda);
			break;
		}
	}

	public void modifyForm() {
		System.out.println("elenco di tutte le schede degli ospiti:");
		for (int i = 0; i < schede.size(); i++) {
			System.out.println(i + ": ");
			schede.get(i).getScheda();
		}
		System.out.println("inserire numero scheda da modificare:");
		int code = userIn.nextInt();
		System.out.println("scheda selezionata:");
		schede.get(code).getScheda();
		schede.get(code).modifyScheda();
	}

	public void removeForm() {
		System.out.println("elenco di tutte le schede degli ospiti:");
		for (int i = 0; i < schede.size(); i++) {
			System.out.println(i + ": ");
			schede.get(i).getScheda();
		}
		System.out.println("inserire numero scheda da rimuovere:");
		int code = userIn.nextInt();
		schede.remove(code);
	}

	public void getForms() {
		System.out.println("elenco di tutte le schede degli ospiti:");
		for (int i = 0; i < schede.size(); i++) {
			schede.get(i).getScheda();
		}
	}

	public void getOwners() {
		System.out.println("elenco di tutti i clienti registrati:");
		for (int i = 0; i < proprietari.size(); i++) {
			proprietari.get(i).getOwnerOnly();
		}
	}

	public void getAnimals() {
		System.out.println("elenco di tutti gli animali registrati:");
		for (int i = 0; i < animali.size(); i++) {
			animali.get(i).getAnimale();
		}
	}

}
