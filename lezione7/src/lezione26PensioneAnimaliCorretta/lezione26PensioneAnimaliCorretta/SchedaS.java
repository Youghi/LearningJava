package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.Scanner;

public class SchedaS {
	
	Scanner userIn;
	
	private Animale animale = null;
	private Proprietario proprietario = null;
	private String arrivalDate;
	private String departureDate;
	private String arrivalTime;
	private String departureTime;
	
	public SchedaS(Scanner userIn) {
		this.userIn = userIn;
	}
	
	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public Animale getAnimale() {
		return animale;
	}

	public void setAnimale(Animale animale) {
		this.animale = animale;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}


	public void setScheda () {
		System.out.println("inserire ora di arrivo (hh.mm): ");
		this.arrivalTime = userIn.next();
		System.out.println("inserire data di arrivo (gg.mm.aaaa): ");
		this.arrivalDate = userIn.next();
		System.out.println("inserire ora di partenza (hh.mm): ");
		this.departureTime = userIn.next();
		System.out.println("inserire data di partenza (gg.mm.aaaa): ");
		this.departureDate = userIn.next();
	}
	
	public void setGuest() {
		this.proprietario = new Proprietario(userIn);
		this.animale = this.proprietario.setDataWithAnimal();
		this.animale.setProprietario(proprietario);
	}

	public void getScheda() {
		System.out.println("--------------");
		System.out.println("ora e data di arrivo: " + this.arrivalTime + "  " + this.arrivalDate);
		System.out.println("ora e data di partenza: " + this.departureTime + "  " + this.departureDate);
		System.out.println("cliente: ");
		this.animale.getAnimale();
	}
	
	public void modifyScheda() {
		int ind = 9;
		while (ind != 0) {

			System.out.println("\n" + "premere:" + "\n" + "1 per modificare l'ora di arrivo" + "\n"
					+ "2 per modificare la data di arrivo" + "\n" + "3 per modificare l'ora di partenza" + "\n"
					+ "4 per modificare la data di partenza" + "\n" + "5 per modificare i dati dell'animale" + "\n"
					+ "6 per modificare i dati del proprietario" + "\n" + "0 per uscire" + "\n");
			ind = userIn.nextInt();

			switch (ind) {
			case 1:
				System.out.println("ora di arrivo da modificare: " + this.arrivalTime);
				System.out.println("inserire nuova ora di arrivo (hh.mm): ");
				this.arrivalTime = userIn.next();
				break;

			case 2:
				System.out.println("data di arrivo da modificare: " + this.arrivalDate);
				System.out.println("inserire nuova data di arrivo (gg.mm.aaaa): ");
				this.arrivalDate = userIn.next();
				break;

			case 3:
				System.out.println("ora di partenza da modificare: " + this.departureTime);
				System.out.println("inserire nuova ora di partenza (hh.mm): ");
				this.departureTime = userIn.next();
				break;

			case 4:
				System.out.println("data di partenza da modificare: " + this.departureDate);
				System.out.println("inserire nuova data di partenza (gg.mm.aaaa): ");
				this.departureDate = userIn.next();
				break;

			case 5:
				System.out.println("dati animale:");
				this.animale.getAnimale();
				this.animale.modifyAnimal();
				break;

			case 6:
				System.out.println("dati proprietario:");
				this.proprietario.getOwnerOnly();
				this.proprietario.modifyOwner();
				break;

			case 0:
				break;
			}

		}
	}
	
	
	
}
