package lezione26PensioneAnimaliCorretta.lezione26PensioneAnimaliCorretta;

import java.util.Scanner;

public class SchedaS {
	
	Scanner userIn;
	
	private Animale animale = null;
	private Proprietario proprietario = null;
	private String arrival;
	private String departure;
	
	
	public SchedaS(Scanner userIn) {
		this.userIn = userIn;
	}
	
	
	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
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
		
	}
	
	
	
	
	
	
	
}
